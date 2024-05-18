/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.PrestamoEntidad;
import excepciones.PrestamoException;
import interfaces.IPrestamosDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public class PrestamosDAO implements IPrestamosDAO {

    private EntityManagerFactory entityManagerFactory;

    public PrestamosDAO() {
        this.entityManagerFactory = Conexion.getInstance();
    }
    
      @Override
      public void agregarPrestamo(PrestamoEntidad prestamo) throws PrestamoException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(prestamo); // 
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new PrestamoException("Error al guardar el prestamo: " + e.getMessage() );
        } finally {
            entityManager.close();
        }
    }


    public List<Object[]> consultarPrestamosPorISBN(String isbn) throws PrestamoException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Object[]> resultados = null;

        try {
            String sql = "SELECT a.nombreUsuario, p.fechaPrestamo, p.fechaDevolucion, p.estado "
                    + "FROM prestamos p "
                    + "INNER JOIN alumnos a ON p.id_alumno = a.id_persona "
                    + "INNER JOIN copiaLibrosPrestamo c ON p.id_copiaLibro = c.id_copiaLibro "
                    + "INNER JOIN libros l ON c.id_libro = l.id_libro "
                    + "WHERE l.isbn = ?1";

            Query query = entityManager.createNativeQuery(sql);
            query.setParameter(1, isbn);
            resultados = query.getResultList();
        } catch (Exception e) {
            throw new PrestamoException("Error al consultar préstamos por ISBN: " + isbn);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        return resultados;
    }
}

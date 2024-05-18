/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.VentaEntidad;
import excepciones.PrestamoException;
import excepciones.VentaException;
import interfaces.IVentaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Usuario
 */
public class VentaDAO implements IVentaDAO{

    private EntityManagerFactory entityManagerFactory;

    public VentaDAO() {
        this.entityManagerFactory = Conexion.getInstance();
    }

       @Override
      public void agregarVenta(VentaEntidad venta) throws VentaException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(venta); // 
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new VentaException("Error al guardar la venta: " + e.getMessage() );
        } finally {
            entityManager.close();
        }
    }
    
    
    
    public List<Object[]> consultarVentaPorISBN(String isbn) throws VentaException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String sql = "SELECT a.nombreUsuario, v.fechaVenta, v.precioVenta "
                + "FROM ventas v "
                + "INNER JOIN alumnos a ON v.id_alumno = a.id_persona "
                + "INNER JOIN copiaLibrosVenta c ON v.id_copiaLibroVenta = c.id_copiaLibroVenta "
                + "INNER JOIN libros l ON c.id_libro = l.id_libro "
                + "WHERE l.isbn = ?1";

        List<Object[]> resultados = entityManager.createNativeQuery(sql)
                .setParameter(1, isbn)
                .getResultList();

        return resultados;
    }
}

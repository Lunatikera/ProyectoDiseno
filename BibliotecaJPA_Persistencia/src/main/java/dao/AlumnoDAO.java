/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.AlumnoEntidad;
import excepciones.AlumnoExcepcion;
import interfaces.IAlumnoDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Usuario
 */
public class AlumnoDAO implements IAlumnoDAO {

    private EntityManagerFactory entityManagerFactory;

    public AlumnoDAO() {
        this.entityManagerFactory = Conexion.getInstance();
    }

    @Override
    public List<AlumnoEntidad> listaAlumnos() throws AlumnoExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createQuery("SELECT a FROM AlumnoEntidad a");
            return query.getResultList();
        } catch (Exception e) {
            throw new AlumnoExcepcion("Error al obtener la lista de alumnos");
        }
    }

    public List<Object[]> obtenerSumaCuotasAdeudadasPorUsuario() throws AlumnoExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;
        List<Object[]> resultados = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            String sql = "SELECT a.nombreUsuario, a.correo, "
                    + "SUM(CASE "
                    + "    WHEN p.estado = 'Pendiente' AND p.fechaDevolucion < CURRENT_DATE() "
                    + "    THEN DATEDIFF(CURRENT_DATE(), p.fechaDevolucion) * pa.costo "
                    + "    ELSE 0 "
                    + "END) AS suma_cuotas_adeudadas "
                    + "FROM prestamos p "
                    + "INNER JOIN alumnos a ON a.id_persona = p.id_alumno "
                    + "INNER JOIN precioadeudo pa ON pa.id_adeudo = p.id_adeudo "
                    + "GROUP BY a.nombreUsuario, a.correo";

            Query query = entityManager.createNativeQuery(sql);
            resultados = query.getResultList();

            System.out.println("Resultados: " + resultados);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw new AlumnoExcepcion("Error al obtener la suma de cuotas adeudadas por usuario");
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        return resultados;
    }

    @Override
    public AlumnoEntidad consultarAlumno(String nombreUsuario) throws AlumnoExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            TypedQuery<AlumnoEntidad> query = entityManager.createQuery(
                    "SELECT l FROM AlumnoEntidad l WHERE l.nombreUsuario = :nombreUsuario",
                    AlumnoEntidad.class
            );
            query.setParameter("nombreUsuario", nombreUsuario);

            AlumnoEntidad alumno = query.getSingleResult();
            return alumno;
        } catch (NoResultException e) {
            throw new AlumnoExcepcion("No se encontró el libro con el ISBN proporcionado.");
        } finally {
            entityManager.close();
        }
    }
}

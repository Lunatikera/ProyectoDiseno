/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamo;

import DTO.AlumnoPrestamoDTO;
import DTO.LibroDTO;
import DTO.PrestamoDTO;
import Excepcion.NegocioException;
import Negocio.AlumnoBO;
import Negocio.LibroBO;
import Negocio.PrestamoBO;
import dao.Conexion;
import entidades.CopiaLibroPrestamoEntidad;
import exception.CopiaLibroNoDisponibleException;
import exception.PrestamoServiceException;
import interfaces.IAlumnoBO;
import interfaces.ILibroBO;
import interfaces.IPrestamosBO;
import interfaz.IPrestamoService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PrestamoService implements IPrestamoService {

    private EntityManagerFactory entityManagerFactory;
    private IPrestamosBO prestamoBO;
    private ILibroBO libroBO;
    private IAlumnoBO alumnoBO;

    public PrestamoService() {
        this.entityManagerFactory = Conexion.getInstance();
        this.prestamoBO = new PrestamoBO();
        this.libroBO = new LibroBO();
        this.alumnoBO=new AlumnoBO();
    }
    
    
    public AlumnoPrestamoDTO consultarAlumnoPrestamo(String nomUsuario) throws PrestamoServiceException{
        try {
            // Consultar el DTO del libro utilizando el ISBN
            AlumnoPrestamoDTO alumno = alumnoBO.consultarAlumnoPrestamo(nomUsuario);

            // Retornar el DTO del libro obtenido de la consulta
            return alumno;

        } catch (NegocioException ex) {
            // Manejar la excepción en caso de que ocurra
            JOptionPane.showMessageDialog(null, "Error al consultar el alumno:  " + nomUsuario + ": " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    

    @Override
    public LibroDTO consultarLibro(String isbn) throws PrestamoServiceException{
        try {
            // Consultar el DTO del libro utilizando el ISBN
            LibroDTO libro = libroBO.consultarLibro(isbn);

            // Retornar el DTO del libro obtenido de la consulta
            return libro;

        } catch (NegocioException ex) {
            // Manejar la excepción en caso de que ocurra
            JOptionPane.showMessageDialog(null, "Error al consultar el libro con ISBN " + isbn + ": " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

   public void prestarLibro(Long idCopiaLibro, Long idAlumno) throws PrestamoServiceException {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = null;
    PrestamoDTO prestamo = new PrestamoDTO(idAlumno, idCopiaLibro);
    try {
        transaction = entityManager.getTransaction();
        transaction.begin();

        CopiaLibroPrestamoEntidad copiaLibro = entityManager.find(CopiaLibroPrestamoEntidad.class, idCopiaLibro);
        if (copiaLibro != null && copiaLibro.getCantidadDisponible() > 0) {
            copiaLibro.setCantidadDisponible(copiaLibro.getCantidadDisponible() - 1);
            entityManager.merge(copiaLibro); // Actualiza la entidad en la base de datos
            prestamoBO.agregarPrestamo(prestamo);
            transaction.commit();
        } else {
            // Si no se encuentra la copia de libro o no hay copias disponibles, lanza una excepción específica
            throw new CopiaLibroNoDisponibleException("El producto seleccionado esta fuera de Stock");
        }
    } catch (CopiaLibroNoDisponibleException e) {
        // Si ocurre una excepción específica, maneja el error adecuadamente
        if (transaction != null) {
            transaction.rollback();
        }
        throw new PrestamoServiceException("Error al prestar el libro: " + e.getMessage());
    } catch (Exception e) {
        // Maneja otras excepciones generales
        if (transaction != null) {
            transaction.rollback();
        }
        throw new PrestamoServiceException("Error inesperado al prestar el libro: " + e.getMessage());
    } finally {
        entityManager.close();
    }
}

}

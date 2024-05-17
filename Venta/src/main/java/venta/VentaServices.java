/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta;

import DTO.AlumnoPrestamoDTO;
import DTO.LibroDTO;
import DTO.PrestamoDTO;
import DTO.VentaDTO;
import Excepcion.NegocioException;
import Negocio.AlumnoBO;
import Negocio.LibroBO;
import Negocio.PrestamoBO;
import Negocio.VentasBO;
import dao.Conexion;
import entidades.CopiaLibroPrestamoEntidad;
import entidades.CopiaLibroVentaEntidad;
import execption.CopiaLibroVentaNoDisponibleException;
import execption.VentaServiceException;
import interfaces.IAlumnoBO;
import interfaces.ILibroBO;
import interfaces.IPrestamosBO;
import interfaces.IVentasBO;
import interfaz.IVentaServices;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VentaServices implements IVentaServices {

    private EntityManagerFactory entityManagerFactory;
    private IVentasBO ventaBO;
    private ILibroBO libroBO;
    private IAlumnoBO alumnoBO;

    public VentaServices() {
        this.entityManagerFactory = Conexion.getInstance();
        this.ventaBO = new VentasBO();
        this.libroBO = new LibroBO();
        this.alumnoBO = new AlumnoBO();
    }

    @Override
    public void venderLibro(Long idCopiaLibro, Long idAlumno, double precio) throws VentaServiceException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;
        VentaDTO venta = new VentaDTO(idAlumno, idCopiaLibro);
        System.out.println(venta.getId_alumno                                                                                                                   ());
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            CopiaLibroVentaEntidad copiaLibro = entityManager.find(CopiaLibroVentaEntidad.class, idCopiaLibro);
            if (copiaLibro != null && copiaLibro.getCantidadDisponible() > 0) {
                copiaLibro.setCantidadDisponible(copiaLibro.getCantidadDisponible() - 1);
                entityManager.merge(copiaLibro); // Actualiza la entidad en la base de datos
                ventaBO.agregarVenta(venta);
                transaction.commit();
            } else {
                // Si no se encuentra la copia de libro o no hay copias disponibles, lanza una excepción específica
                throw new CopiaLibroVentaNoDisponibleException("El producto seleccionado esta fuera de Stock");
            }
        } catch (CopiaLibroVentaNoDisponibleException e) {
            // Si ocurre una excepción específica, maneja el error adecuadamente
            if (transaction != null) {
                transaction.rollback();
            }
            throw new VentaServiceException("Error al Vender el libro: " + e.getMessage());
        } catch (Exception e) {
            // Maneja otras excepciones generales
            if (transaction != null) {
                transaction.rollback();
            }
            throw new VentaServiceException("Error inesperado al vender el libro: " + e.getMessage());
        } finally {
            entityManager.close();
        }
    }

    @Override
    public LibroDTO consultarLibro(String isbn) throws VentaServiceException {
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

    @Override
    public AlumnoPrestamoDTO consultarAlumnoVenta(String nomUsuario) throws VentaServiceException {
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
}

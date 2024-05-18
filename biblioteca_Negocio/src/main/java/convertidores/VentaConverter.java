/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.PrestamoDTO;
import DTO.VentaDTO;
import entidades.AlumnoEntidad;
import entidades.CopiaLibroPrestamoEntidad;
import entidades.CopiaLibroVentaEntidad;
import entidades.LibroEntidad;
import entidades.PrestamoEntidad;
import entidades.VentaEntidad;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class VentaConverter {

    private static EntityManagerFactory entityManagerFactory;

    static {
        // Inicializa el EntityManagerFactory una vez
        entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaJPA");
    }

    public static VentaEntidad convertirPrestamoDTOAPrestamo(VentaDTO ventaDTO) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        VentaEntidad venta = new VentaEntidad();

        Long idAlumno = ventaDTO.getId_alumno();
        System.out.println(idAlumno);
        if (idAlumno == null) {
            throw new RuntimeException("El ID del alumno no puede ser nulo.");
        }
        AlumnoEntidad alumno = entityManager.find(AlumnoEntidad.class, idAlumno);
        if (alumno != null) {
            venta.setAlumno(alumno);
        } else {
            throw new RuntimeException("El alumno con ID " + idAlumno + " no fue encontrado.");
        }

        // Verificar que el ID del libro no sea nulo
        Long idLibro = ventaDTO.getId_libro();
        if (idLibro == null) {
            throw new RuntimeException("El ID del libro no puede ser nulo.");
        }
        CopiaLibroVentaEntidad copiaLibro = entityManager.find(CopiaLibroVentaEntidad.class, idLibro);
        if (copiaLibro != null) {
            venta.setCopiaLibroVenta(copiaLibro);
        } else {
            throw new RuntimeException("La copia de libro con ID " + idLibro + " no fue encontrada.");
        }

        LibroEntidad libro = entityManager.find(LibroEntidad.class, idLibro);
        if (copiaLibro != null) {
            venta.setPrecioVenta(libro.getPrecio());
        } else {
            throw new RuntimeException("El libro con ID " + idLibro + " no fue encontrado.");
        }
        // Add more logic to set other fields of prestamo entity if needed
        return venta;
    }
}

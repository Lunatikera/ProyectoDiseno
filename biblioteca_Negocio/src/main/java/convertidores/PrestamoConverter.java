/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.PrestamoDTO;
import dao.Conexion;
import entidades.AlumnoEntidad;
import entidades.CopiaLibroPrestamoEntidad;
import entidades.PrecioAdeudoEntidad;
import entidades.PrestamoEntidad;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
public class PrestamoConverter {

    private static EntityManagerFactory entityManagerFactory;

    static {
        // Inicializa el EntityManagerFactory una vez
        entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaJPA");
    }

    public static PrestamoEntidad convertirPrestamoDTOAPrestamo(PrestamoDTO prestamoDTO) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        PrestamoEntidad prestamo = new PrestamoEntidad();

        // Verificar que el ID del alumno no sea nulo
        Long idAlumno = prestamoDTO.getIdAlumnoDTO();
        if (idAlumno == null) {
            throw new RuntimeException("El ID del alumno no puede ser nulo.");
        }
        AlumnoEntidad alumno = entityManager.find(AlumnoEntidad.class, idAlumno);
        if (alumno != null) {
            prestamo.setAlumno(alumno);
        } else {
            throw new RuntimeException("El alumno con ID " + idAlumno + " no fue encontrado.");
        }

        // Verificar que el ID del libro no sea nulo
        Long idLibro = prestamoDTO.getIdLibroDTO();
        if (idLibro == null) {
            throw new RuntimeException("El ID del libro no puede ser nulo.");
        }
        CopiaLibroPrestamoEntidad copiaLibro = entityManager.find(CopiaLibroPrestamoEntidad.class, idLibro);
        if (copiaLibro != null) {
            prestamo.setCopiaLibro(copiaLibro);
        } else {
            throw new RuntimeException("La copia de libro con ID " + idLibro + " no fue encontrada.");
        }

        // Add more logic to set other fields of prestamo entity if needed
        return prestamo;
    }
}
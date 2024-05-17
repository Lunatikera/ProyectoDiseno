/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.PrestamoDTO;
import entidades.AlumnoEntidad;
import entidades.CopiaLibroPrestamoEntidad;
import entidades.PrecioAdeudoEntidad;
import entidades.PrestamoEntidad;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class PrestamoConverter {
     public static PrestamoEntidad convertirLibroDTOALibro(PrestamoDTO prestamoDTO) {
        PrestamoEntidad prestamo = new PrestamoEntidad();

        AlumnoEntidad alumno = entityManager.find(AlumnoEntidad.class, prestamoDTO.getIdAlumnoDTO());
        if (alumno != null) {
            prestamo.setAlumno(alumno);
        } else {
        }

        CopiaLibroPrestamoEntidad copiaLibro = entityManager.find(CopiaLibroPrestamoEntidad.class, prestamoDTO.getIdLibroDTO());
        if (copiaLibro != null) {
            prestamo.setCopiaLibro(copiaLibro);
        } else {
        }

        if (prestamo.getFechaPrestamo() == null) {
            Calendar fechaPrestamo = Calendar.getInstance();
            prestamo.setFechaPrestamo(fechaPrestamo);

            // Set fechaDevolucion to 10 days after fechaPrestamo
            Calendar fechaDevolucion = (Calendar) fechaPrestamo.clone();
            fechaDevolucion.add(Calendar.DAY_OF_MONTH, 10);
            prestamo.setFechaDevolucion(fechaDevolucion);
        }

        // Retrieve PrecioAdeudoEntidad with id 1
        PrecioAdeudoEntidad adeudo = entityManager.find(PrecioAdeudoEntidad.class, 1L);
        if (adeudo != null) {
            prestamo.setAdeudo(adeudo);
        } else {
            // Handle the case where the adeudo is not found, e.g., throw an exception or log an error
        }

        return prestamo;
    }
}



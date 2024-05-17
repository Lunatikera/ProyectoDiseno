/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.AlumnoEntidad;
import excepciones.AlumnoExcepcion;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IAlumnoDAO {

    public List<AlumnoEntidad> listaAlumnos() throws AlumnoExcepcion;

    public AlumnoEntidad consultarAlumno(String nombreUsuario) throws AlumnoExcepcion;

    public List<Object[]> obtenerSumaCuotasAdeudadasPorUsuario() throws AlumnoExcepcion;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.AlumnoAdeudoDTO;
import DTO.AlumnoInicioSesionDTO;
import DTO.AlumnoPrestamoDTO;
import Excepcion.NegocioException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IAlumnoBO {

    public List<AlumnoInicioSesionDTO> listaAlumnosInicioSesion() throws NegocioException;

    public List<AlumnoAdeudoDTO> listaAlumnosAdeudo() throws NegocioException;

    public AlumnoAdeudoDTO consultarAlumno(String nombreUsuario) throws NegocioException;

    public AlumnoPrestamoDTO consultarAlumnoPrestamo(String nombreUsuario) throws NegocioException;
}

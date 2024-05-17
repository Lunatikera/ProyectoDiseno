/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import DTO.AlumnoInicioSesionDTO;
import Excepcion.AutenticationException;
import Excepcion.NegocioException;

/**
 *
 * @author Usuario
 */
public interface IAutenticationService {

    public boolean validarAlumno(String correo, String contraseña) throws AutenticationException;

    public AlumnoInicioSesionDTO alumnoActivo() throws NegocioException, AutenticationException;

}

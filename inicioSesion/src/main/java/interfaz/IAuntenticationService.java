/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import Excepcion.AutenticationException;

/**
 *
 * @author Usuario
 */
public interface IAuntenticationService {

    public boolean validarAlumno(String nombreUsuario, String contraseña) throws AutenticationException;

    public boolean validarAdministrador(String nombreUsuario, String contraseña) throws AutenticationException;
    
}

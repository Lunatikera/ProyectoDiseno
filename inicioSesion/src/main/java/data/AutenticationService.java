/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import DTO.AlumnoInicioSesionDTO;
import dao.AlumnoDAO;
import Excepcion.AutenticationException;
import Excepcion.NegocioException;
import interfaces.IAlumnoBO;
import interfaz.IAutenticationService;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skevi
 */
public class AutenticationService implements IAutenticationService {

    private IAlumnoBO alumnoBO;

    public AutenticationService(IAlumnoBO alumnoBO) {
        this.alumnoBO = alumnoBO;
    }

    /**
     * este metodo nos ayuda a validar si el id y la contraseña se encuentran
     * dentro de la base de datos y lo valida.
     *
     *
     * @param nombreUsuario
     * @param contraseña contraseña del usuario.
     * @return retorna true en caso de que la contraseña coincida con el id del
     * usuario.
     * @throws AutenticationException en caso de que no coincida la contraseña
     * del usuario en el id proporcionado
     */
    public boolean validarAlumno(String nombreUsuario, String contraseña) throws AutenticationException {
        try {
            // Obtenemos la instancia del SessionManager
            SessionManager sessionManager = SessionManager.getInstance();

            // Recorremos la lista de alumnos
            for (AlumnoInicioSesionDTO alumno : alumnoBO.listaAlumnos()) {
                // Comprobamos si las credenciales coinciden
                if (alumno.getNombreUsuario().equalsIgnoreCase(nombreUsuario)
                        && alumno.getPasswordDTO().equalsIgnoreCase(contraseña)) {
                    // Si coinciden, guardamos el ID del usuario en la sesión
                    sessionManager.setUserName(alumno.getNombreUsuario());
                    return true;
                }
            }
        } catch (NegocioException ex) {
            throw new AutenticationException("No se pudo verificar las credenciales");
        }

        // Si no se encontraron credenciales válidas, lanzamos una excepción
        throw new AutenticationException("Error en correo o contraseña");
    }

    public AlumnoInicioSesionDTO alumnoActivo() throws NegocioException, AutenticationException {
        SessionManager sessionManager = SessionManager.getInstance();
        for (AlumnoInicioSesionDTO alumno : alumnoBO.listaAlumnos()) {
            // Comprobamos si las credenciales coinciden
            if (alumno.getNombreUsuario().equalsIgnoreCase(sessionManager.getUserName()) ) {
               return alumno; 
            }
        }
            throw new AutenticationException("No se pudo verificar las credenciales");
    }

    

    public boolean validarAdministrador(int id, String contraseña) {
        return false;
    }

}

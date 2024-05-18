/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import DTO.AdministradorInicioSesionDTO;
import DTO.AlumnoInicioSesionDTO;
import Excepcion.AutenticationException;
import Excepcion.NegocioException;
import Negocio.AdministradorBO;
import Negocio.AlumnoBO;
import static com.mysql.cj.conf.PropertyKey.logger;
import guardado.Guardado;
import interfaces.IAdministradorBO;
import interfaces.IAlumnoBO;
import interfaz.IAuntenticationService;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author skevi
 */
public class AutenticationService implements IAuntenticationService {

    private static final Logger logger = Logger.getLogger(AutenticationService.class.getName());

    IAlumnoBO alumno;
    IAdministradorBO administrador;
    Guardado guardar = new Guardado();

    public AutenticationService() {
        this.alumno = new AlumnoBO();
        this.administrador = new AdministradorBO();

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
            List<AlumnoInicioSesionDTO> listaAlumnos = alumno.listaAlumnosInicioSesion();
            if (listaAlumnos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay alumnos registrados.");
                return false;
            }
            Optional<AlumnoInicioSesionDTO> alumnoOptional = listaAlumnos.stream()
                    .filter(a -> a.getNombreUsuario().equalsIgnoreCase(nombreUsuario) && a.getPasswordDTO().equalsIgnoreCase(contraseña))
                    .findFirst();

            if (alumnoOptional.isPresent()) {
                guardar.setUsuarioAlumno(nombreUsuario);
                return true;
            } else {
                return false;
            }
        } catch (NegocioException ex) {
            throw new AutenticationException("No se pudo verificar las credenciales");
        }
    }

    /**
     *
     * @param nombreUsuario
     * @param contraseña
     * @return
     * @throws AutenticationException
     */
    public boolean validarAdministrador(String nombreUsuario, String contraseña) throws AutenticationException {
        try {
            List<AdministradorInicioSesionDTO> listaAdmin = administrador.listaAdministradores();
        System.out.println("Lista de administradores: " + listaAdmin); // Print the list of administrators

            // Verificar si la lista de administradores está vacía
            if (listaAdmin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay administradores registrados.");
                return false;
            }

            Optional<AdministradorInicioSesionDTO> adminOptional = listaAdmin.stream()
                    .filter(a -> a.getNombreUsuario().equalsIgnoreCase(nombreUsuario) && a.getPasswordDTO().equalsIgnoreCase(contraseña))
                    .findFirst();

            if (adminOptional.isPresent()) {
                guardar.setUsuarioAdministrador(nombreUsuario);
                return true;
            } else {
                System.out.println("No se encontró ningún administrador con las credenciales proporcionadas"); // Print a message if the administrator is not found
                return false;
            }
        } catch (NegocioException ex) {
            throw new AutenticationException("No se pudo verificar las credenciales");
        }
    }
}

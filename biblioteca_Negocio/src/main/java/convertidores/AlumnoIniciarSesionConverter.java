/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.AlumnoInicioSesionDTO;
import entidades.AlumnoEntidad;

/**
 *
 * @author Usuario
 */
public class AlumnoIniciarSesionConverter {
     
    public static AlumnoInicioSesionDTO convertirAlumnoAAlumnoDTO(AlumnoEntidad alumno) {
        AlumnoInicioSesionDTO aLumnoDTO = new AlumnoInicioSesionDTO();
        aLumnoDTO.setNombreUsuario(alumno.getNombreUsuario());
        aLumnoDTO.setPasswordDTO(alumno.getPassword());
        return aLumnoDTO;
    }
    
    public static AlumnoEntidad convertirAlumnoDTOAAlumno(AlumnoInicioSesionDTO alumnoDTO) {
        AlumnoEntidad alumno=  new AlumnoEntidad();
        alumno.setNombreUsuario(alumnoDTO.getNombreUsuario());
        alumno.setPassword(alumnoDTO.getPasswordDTO());
        return alumno;
    }
    
}
   


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.AlumnoPrestamoDTO;
import entidades.AlumnoEntidad;

/**
 *
 * @author Usuario
 */
public class AlumnoPrestamoVentaConvertidor {
     public static AlumnoPrestamoDTO convertirAlumnoAAlumnoDTO(AlumnoEntidad alumno) {
        AlumnoPrestamoDTO aLumnoDTO = new AlumnoPrestamoDTO();
        aLumnoDTO.setId_ALumno(alumno.getId());
        aLumnoDTO.setNombreUsuarioDTO(alumno.getNombreUsuario());
        aLumnoDTO.setCorreoElectronicoDTO(alumno.getCorreo());
        return aLumnoDTO;
    }

    
    
}
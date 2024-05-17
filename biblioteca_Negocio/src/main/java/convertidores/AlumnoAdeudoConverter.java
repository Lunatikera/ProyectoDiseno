/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.AlumnoAdeudoDTO;
import entidades.AlumnoEntidad;

/**
 *
 * @author Usuario
 */
public class AlumnoAdeudoConverter {
     public static AlumnoAdeudoDTO convertirAlumnoAAlumnoDTO(AlumnoEntidad alumno) {
        AlumnoAdeudoDTO aLumnoDTO = new AlumnoAdeudoDTO();
        aLumnoDTO.setNombreUsuarioDTO(alumno.getNombreUsuario());
        aLumnoDTO.setCorreoElectronicoDTO(alumno.getCorreo());
        return aLumnoDTO;
    }
    
    public static AlumnoAdeudoDTO convertirAlumnoAAlumnoAdeudoDTO(Object[] prestamoTabla) {
        AlumnoAdeudoDTO aLumnoDTO = new AlumnoAdeudoDTO();
        aLumnoDTO.setNombreUsuarioDTO((String) prestamoTabla[0]);
        aLumnoDTO.setCorreoElectronicoDTO((String) prestamoTabla[1]);
        aLumnoDTO.setAdeudo((double) prestamoTabla[2]);
        return aLumnoDTO;
    }
    
    
}


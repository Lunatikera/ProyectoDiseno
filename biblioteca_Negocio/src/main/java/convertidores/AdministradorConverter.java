/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.AdministradorInicioSesionDTO;
import entidades.AdministradorEntidad;

/**
 *
 * @author Usuario
 */
public class AdministradorConverter {
    
    public static AdministradorInicioSesionDTO convertirAdministradorAAdministradorDTO(AdministradorEntidad administrador) {
        AdministradorInicioSesionDTO administradorDTO = new AdministradorInicioSesionDTO();
        administradorDTO.setNombreUsuario(administrador.getNombreUsuario());
        administradorDTO.setPasswordDTO(administrador.getPassword());
        return administradorDTO;
    }
    
    public static AdministradorEntidad convertirAdministradorDTOAAdmnistrador(AdministradorInicioSesionDTO administradorDTO) {
        AdministradorEntidad administrador = new AdministradorEntidad();
        administrador.setNombreUsuario(administradorDTO.getNombreUsuario());
        administrador.setPassword(administrador.getPassword());
        return administrador;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.AdministradorDTO;
import entidades.AdministradorEntidad;

/**
 *
 * @author Usuario
 */
public class AdministradorConverter {
    
    public static AdministradorDTO convertirAdministradorAAdministradorDTO(AdministradorEntidad administrador) {
        AdministradorDTO administradorDTO = new AdministradorDTO();
        administradorDTO.setNombreUsuario(administrador.getNombreUsuario());
        administradorDTO.setContraseñaDTO(administrador.getPassword());
        return administradorDTO;
    }
    
    public static AdministradorEntidad convertirAdministradorDTOAAdmnistrador(AdministradorDTO administradorDTO) {
        AdministradorEntidad administrador = new AdministradorEntidad();
        administrador.setNombreUsuario(administradorDTO.getNombreUsuario());
        administrador.setPassword(administrador.getPassword());
        return administrador;
    }
    
}

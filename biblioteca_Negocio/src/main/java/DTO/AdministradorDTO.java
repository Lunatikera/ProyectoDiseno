/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author skevi
 */
public class AdministradorDTO {
    private String nombreUsuario;
    private String paswsordDTO;

    public AdministradorDTO() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


    public String getContraseñaDTO() {
        return paswsordDTO;
    }

    public void setContraseñaDTO(String paswsordDTO) {
        this.paswsordDTO = paswsordDTO;
    }
}

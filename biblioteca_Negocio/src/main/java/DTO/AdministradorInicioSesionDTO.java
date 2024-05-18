/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author skevi
 */
public class AdministradorInicioSesionDTO {
    private String nombreUsuario;
    private String passwordDTO;

    public AdministradorInicioSesionDTO() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordDTO() {
        return passwordDTO;
    }

    public void setPasswordDTO(String passwordDTO) {
        this.passwordDTO = passwordDTO;
    }


}

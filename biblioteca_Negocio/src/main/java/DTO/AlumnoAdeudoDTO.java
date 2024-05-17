/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Usuario
 */
public class AlumnoAdeudoDTO {

    private String nombreUsuarioDTO;
    private String correoElectronicoDTO;
    private double adeudo;

    public AlumnoAdeudoDTO() {
    }

    public String getNombreUsuarioDTO() {
        return nombreUsuarioDTO;
    }

    public void setNombreUsuarioDTO(String nombreUsuarioDTO) {
        this.nombreUsuarioDTO = nombreUsuarioDTO;
    }

    public String getCorreoElectronicoDTO() {
        return correoElectronicoDTO;
    }

    public void setCorreoElectronicoDTO(String correoElectronicoDTO) {
        this.correoElectronicoDTO = correoElectronicoDTO;
    }

    public double getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(double adeudo) {
        this.adeudo = adeudo;
    }
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Usuario
 */
public class AlumnoPrestamoDTO {
    private Long id_ALumno;
    private String nombreUsuarioDTO;
    private String correoElectronicoDTO;

    public AlumnoPrestamoDTO() {
    }

    public Long getId_ALumno() {
        return id_ALumno;
    }

    public void setId_ALumno(Long id_ALumno) {
        this.id_ALumno = id_ALumno;
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
    
    
}

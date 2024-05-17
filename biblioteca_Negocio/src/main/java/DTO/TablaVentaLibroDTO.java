/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Timestamp;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class TablaVentaLibroDTO {

    private String nombreUsuarioDTO;
    private Timestamp fechaVentaDTO;
    private double precioVenta;

    public TablaVentaLibroDTO() {
    }

    public String getNombreUsuarioDTO() {
        return nombreUsuarioDTO;
    }

    public void setNombreUsuarioDTO(String nombreUsuarioDTO) {
        this.nombreUsuarioDTO = nombreUsuarioDTO;
    }

    public Timestamp getFechaVentaDTO() {
        return fechaVentaDTO;
    }

    public void setFechaVentaDTO(Timestamp fechaVentaDTO) {
        this.fechaVentaDTO = fechaVentaDTO;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

}

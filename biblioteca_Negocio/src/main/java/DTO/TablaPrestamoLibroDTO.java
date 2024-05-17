/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import enumeradores.EstadoPrestamo;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class TablaPrestamoLibroDTO {
    private String nombreUsuarioDTO;
    private Timestamp fechaPrestamo;
    private Timestamp fechaDevolucion;
    private String estado;

    public TablaPrestamoLibroDTO() {
    }

    public String getNombreUsuarioDTO() {
        return nombreUsuarioDTO;
    }

    public void setNombreUsuarioDTO(String nombreUsuarioDTO) {
        this.nombreUsuarioDTO = nombreUsuarioDTO;
    }

    public Timestamp getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Timestamp fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Timestamp getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Timestamp fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}

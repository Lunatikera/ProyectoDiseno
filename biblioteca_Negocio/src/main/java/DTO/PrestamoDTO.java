/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author skevi
 */
public class PrestamoDTO {
    
    private Calendar fechaPrestamoDTO;
    private Calendar fechaDevolucionDTO;
    private int idAlumnoDTO;
    private int idLibroDTO;

    public PrestamoDTO() {
    }

    public PrestamoDTO(Calendar fechaPrestamoDTO, Calendar fechaDevolucionDTO, int idAlumnoDTO, int idLibroDTO) {
        this.fechaPrestamoDTO = fechaPrestamoDTO;
        this.fechaDevolucionDTO = fechaDevolucionDTO;
        this.idAlumnoDTO = idAlumnoDTO;
        this.idLibroDTO = idLibroDTO;
    }

  

    public Calendar getFechaPrestamoDTO() {
        return fechaPrestamoDTO;
    }

    public void setFechaPrestamoDTO(Calendar fechaPrestamoDTO) {
        this.fechaPrestamoDTO = fechaPrestamoDTO;
    }

    public Calendar getFechaDevolucionDTO() {
        return fechaDevolucionDTO;
    }

    public void setFechaDevolucionDTO(Calendar fechaDevolucionDTO) {
        this.fechaDevolucionDTO = fechaDevolucionDTO;
    }

    public int getIdAlumnoDTO() {
        return idAlumnoDTO;
    }

    public void setIdAlumnoDTO(int idAlumnoDTO) {
        this.idAlumnoDTO = idAlumnoDTO;
    }

    public int getIdLibroDTO() {
        return idLibroDTO;
    }

    public void setIdLibroDTO(int idLibroDTO) {
        this.idLibroDTO = idLibroDTO;
    }
 
}

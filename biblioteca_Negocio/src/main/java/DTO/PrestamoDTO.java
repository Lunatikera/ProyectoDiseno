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
    private Long idAlumnoDTO;
    private Long idLibroDTO;

    public PrestamoDTO() {
    }

    public PrestamoDTO(Calendar fechaPrestamoDTO, Calendar fechaDevolucionDTO, Long idAlumnoDTO, Long idLibroDTO) {
        this.fechaPrestamoDTO = fechaPrestamoDTO;
        this.fechaDevolucionDTO = fechaDevolucionDTO;
        this.idAlumnoDTO = idAlumnoDTO;
        this.idLibroDTO = idLibroDTO;
    }

    public PrestamoDTO(Long idAlumnoDTO, Long idLibroDTO) {
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

    public Long getIdAlumnoDTO() {
        return idAlumnoDTO;
    }

    public void setIdAlumnoDTO(Long idAlumnoDTO) {
        this.idAlumnoDTO = idAlumnoDTO;
    }

    public Long getIdLibroDTO() {
        return idLibroDTO;
    }

    public void setIdLibroDTO(Long idLibroDTO) {
        this.idLibroDTO = idLibroDTO;
    }
 
}

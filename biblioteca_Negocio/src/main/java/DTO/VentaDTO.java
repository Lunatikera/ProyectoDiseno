/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Usuario
 */
public class VentaDTO {

    private Long id_libro;
    private Long id_alumno;
    private double precioVenta;

    public VentaDTO(Long idAlumno, Long idCopiaLibro) {
        this.id_libro = idCopiaLibro;
        this.id_alumno = idAlumno;
    }

    public VentaDTO(Long id_libro, Long id_alumno, double precioVenta) {
        this.id_libro = id_libro;
        this.id_alumno = id_alumno;
        this.precioVenta = precioVenta;
    }

    public Long getId_libro() {
        return id_libro;
    }

    public void setId_libro(Long id_libro) {
        this.id_libro = id_libro;
    }

    public Long getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Long id_alumno) {
        this.id_alumno = id_alumno;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

}

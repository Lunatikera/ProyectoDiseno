/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "ventas")
public class VentaEntidad implements Serializable {

    @Id
    @Column(name = "id_venta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_venta;

    @Column(name = "fechaVenta")
    private Calendar fechaVenta;

    @Column(name = "precioVenta")
    private double precioVenta;

    @ManyToOne(targetEntity = AlumnoEntidad.class)
    @JoinColumn(name = "id_alumno", nullable = false)
    private AlumnoEntidad alumno;

    @ManyToOne(targetEntity = CopiaLibroVentaEntidad.class)
    @JoinColumn(name = "id_copiaLibroVenta", nullable = false)
    private CopiaLibroVentaEntidad copiaLibroVenta;

    public VentaEntidad() {
    }

    public VentaEntidad(Calendar fechaVenta, double precioVenta, AlumnoEntidad alumno, CopiaLibroVentaEntidad copiaLibroVenta) {
        this.fechaVenta = fechaVenta;
        this.precioVenta = precioVenta;
        this.alumno = alumno;
        this.copiaLibroVenta = copiaLibroVenta;
    }

    public Calendar getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Calendar fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public AlumnoEntidad getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoEntidad alumno) {
        this.alumno = alumno;
    }

    public CopiaLibroVentaEntidad getCopiaLibroVenta() {
        return copiaLibroVenta;
    }

    public void setCopiaLibroVenta(CopiaLibroVentaEntidad copiaLibroVenta) {
        this.copiaLibroVenta = copiaLibroVenta;
    }

    public Long getId() {
        return id_venta;
    }

    public void setId(Long id_venta) {
        this.id_venta = id_venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_venta != null ? id_venta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaEntidad)) {
            return false;
        }
        VentaEntidad other = (VentaEntidad) object;
        if ((this.id_venta == null && other.id_venta != null) || (this.id_venta != null && !this.id_venta.equals(other.id_venta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.VentaEntidad[ id=" + id_venta + " ]";
    }

}

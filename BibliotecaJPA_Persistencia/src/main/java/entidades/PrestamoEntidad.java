/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeradores.EstadoPrestamo;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "prestamos")
public class PrestamoEntidad implements Serializable {

    @Id
    @Column(name = "id_prestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prestamo;

    @Column(name = "fechaPrestamo")
    private Calendar fechaPrestamo;

    @Column(name = "fechaDevolucion")
    private Calendar fechaDevolucion;

    @Column(name = "estado", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoPrestamo estado = EstadoPrestamo.Pendiente;

    @ManyToOne(targetEntity = AlumnoEntidad.class)
    @JoinColumn(name = "id_alumno", nullable = false)
    private AlumnoEntidad alumno;

    @ManyToOne(targetEntity = PrecioAdeudoEntidad.class)
    @JoinColumn(name = "id_adeudo", nullable = false)
    private PrecioAdeudoEntidad adeudo;

    @ManyToOne(targetEntity = CopiaLibroPrestamoEntidad.class)
    @JoinColumn(name = "id_copiaLibro", nullable = false)
    private CopiaLibroPrestamoEntidad copiaLibro;

    public PrestamoEntidad() {
    }

    public PrestamoEntidad(Calendar fechaPrestamo, Calendar fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public PrestamoEntidad(Calendar fechaPrestamo, Calendar fechaDevolucion, AlumnoEntidad alumno, CopiaLibroPrestamoEntidad copiaLibro) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.alumno = alumno;
        this.copiaLibro = copiaLibro;
    }

    public PrestamoEntidad(Calendar fechaPrestamo, Calendar fechaDevolucion, AlumnoEntidad alumno, PrecioAdeudoEntidad adeudo, CopiaLibroPrestamoEntidad copiaLibro) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.alumno = alumno;
        this.adeudo = adeudo;
        this.copiaLibro = copiaLibro;
    }

    public PrecioAdeudoEntidad getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(PrecioAdeudoEntidad adeudo) {
        this.adeudo = adeudo;
    }
    
    public AlumnoEntidad getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoEntidad alumno) {
        this.alumno = alumno;
    }

    public CopiaLibroPrestamoEntidad getCopiaLibro() {
        return copiaLibro;
    }

    public void setCopiaLibro(CopiaLibroPrestamoEntidad copiaLibro) {
        this.copiaLibro = copiaLibro;
    }

    public Long getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(Long id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public EstadoPrestamo getEstado(){
        return estado;
    }

    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }

    public Calendar getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Calendar fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Calendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Calendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Long getId() {
        return id_prestamo;
    }

    public void setId(Long id) {
        this.id_prestamo = id;
    }
    @PrePersist
    protected void onCreate() {
        if (this.fechaPrestamo == null) {
            this.fechaPrestamo = Calendar.getInstance();
        }
        if (this.fechaDevolucion == null) {
            this.fechaDevolucion = (Calendar) this.fechaPrestamo.clone();
            this.fechaDevolucion.add(Calendar.DAY_OF_MONTH, 10);
        }
        if (this.adeudo == null) {
            this.adeudo = new PrecioAdeudoEntidad();
            this.adeudo.setId(1L); 
        }
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_prestamo != null ? id_prestamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestamoEntidad)) {
            return false;
        }
        PrestamoEntidad other = (PrestamoEntidad) object;
        if ((this.id_prestamo == null && other.id_prestamo != null) || (this.id_prestamo != null && !this.id_prestamo.equals(other.id_prestamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PrestamoEntidad[ id=" + id_prestamo + " ]";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "copiaLibrosPrestamo")
public class CopiaLibroPrestamoEntidad implements Serializable {

    @Id
    @Column(name = "id_copiaLibro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_copiaLibro;

    @Column(name = "cantidadDisponible")
    private int cantidadDisponible;

    @Column(name = "CantidadTotal")
    private int CantidadTotal;

    @OneToMany(mappedBy = "copiaLibro", cascade = {CascadeType.PERSIST})
    private List<PrestamoEntidad> prestamo;

    @ManyToOne(targetEntity = LibroEntidad.class)
    @JoinColumn(name = "id_libro", nullable = false)
    private LibroEntidad libro;

    public CopiaLibroPrestamoEntidad() {
    }

    public CopiaLibroPrestamoEntidad(int cantidadDisponible, int CantidadTotal) {
        this.cantidadDisponible = cantidadDisponible;
        this.CantidadTotal = CantidadTotal;
    }

    public CopiaLibroPrestamoEntidad(int cantidadDisponible, int CantidadTotal, List<PrestamoEntidad> prestamo, LibroEntidad libro) {
        this.cantidadDisponible = cantidadDisponible;
        this.CantidadTotal = CantidadTotal;
        this.prestamo = prestamo;
        this.libro = libro;
    }

    public List<PrestamoEntidad> getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(List<PrestamoEntidad> prestamo) {
        this.prestamo = prestamo;
    }

    public LibroEntidad getLibro() {
        return libro;
    }

    public void setLibro(LibroEntidad libro) {
        this.libro = libro;
    }
    

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCantidadTotal() {
        return CantidadTotal;
    }

    public void setCantidadTotal(int CantidadTotal) {
        this.CantidadTotal = CantidadTotal;
    }

    public Long getId() {
        return id_copiaLibro;
    }

    public void setId(Long id) {
        this.id_copiaLibro = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_copiaLibro != null ? id_copiaLibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CopiaLibroPrestamoEntidad)) {
            return false;
        }
        CopiaLibroPrestamoEntidad other = (CopiaLibroPrestamoEntidad) object;
        if ((this.id_copiaLibro == null && other.id_copiaLibro != null) || (this.id_copiaLibro != null && !this.id_copiaLibro.equals(other.id_copiaLibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CopiaLibroPrestamoEntidad[ id=" + id_copiaLibro + " ]";
    }

}

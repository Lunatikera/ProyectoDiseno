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
@Table(name = "copiaLibrosVenta")
public class CopiaLibroVentaEntidad implements Serializable {

    @Id
    @Column(name = "id_copiaLibroVenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_copiaLibroVenta;

    @Column(name = "cantidadDisponible")
    private Integer cantidadDisponible;

    @OneToMany(mappedBy = "copiaLibroVenta", cascade = {CascadeType.PERSIST})
    private List<VentaEntidad> venta;

    @ManyToOne(targetEntity = LibroEntidad.class)
    @JoinColumn(name = "id_libro", nullable = false)
    private LibroEntidad libro;

    public CopiaLibroVentaEntidad() {
    }

    public CopiaLibroVentaEntidad(Integer cantidadDisponible, List<VentaEntidad> venta, LibroEntidad libro) {
        this.cantidadDisponible = cantidadDisponible;
        this.venta = venta;
        this.libro = libro;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public List<VentaEntidad> getVenta() {
        return venta;
    }

    public void setVenta(List<VentaEntidad> venta) {
        this.venta = venta;
    }

    public LibroEntidad getLibro() {
        return libro;
    }

    public void setLibro(LibroEntidad libro) {
        this.libro = libro;
    }

    public Long getId() {
        return id_copiaLibroVenta;
    }

    public void setId(Long id_copiaLibroVenta) {
        this.id_copiaLibroVenta = id_copiaLibroVenta;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_copiaLibroVenta != null ? id_copiaLibroVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CopiaLibroVentaEntidad)) {
            return false;
        }
        CopiaLibroVentaEntidad other = (CopiaLibroVentaEntidad) object;
        if ((this.id_copiaLibroVenta == null && other.id_copiaLibroVenta != null) || (this.id_copiaLibroVenta != null && !this.id_copiaLibroVenta.equals(other.id_copiaLibroVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CopiaLibroVenta[ id=" + id_copiaLibroVenta + " ]";
    }

}

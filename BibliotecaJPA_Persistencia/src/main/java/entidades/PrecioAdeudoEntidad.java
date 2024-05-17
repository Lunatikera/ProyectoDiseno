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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "precioadeudo")
public class PrecioAdeudoEntidad implements Serializable {

    @Id
    @Column(name = "id_adeudo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_adeudo;

    @Column(name = "costo")
    private double costo;

    @OneToMany(mappedBy = "adeudo", cascade = {CascadeType.PERSIST})
    private List<PrestamoEntidad> prestamo;

    public PrecioAdeudoEntidad() {
    }

    public PrecioAdeudoEntidad(double costo, List<PrestamoEntidad> prestamo) {
        this.costo = costo;
        this.prestamo = prestamo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public List<PrestamoEntidad> getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(List<PrestamoEntidad> prestamo) {
        this.prestamo = prestamo;
    }

    public Long getId() {
        return id_adeudo;
    }

    public void setId(Long id_adeudo) {
        this.id_adeudo = id_adeudo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_adeudo != null ? id_adeudo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrecioAdeudoEntidad)) {
            return false;
        }
        PrecioAdeudoEntidad other = (PrecioAdeudoEntidad) object;
        if ((this.id_adeudo == null && other.id_adeudo != null) || (this.id_adeudo != null && !this.id_adeudo.equals(other.id_adeudo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PrecioAdeudoEntidad[ id=" + id_adeudo + " ]";
    }

}

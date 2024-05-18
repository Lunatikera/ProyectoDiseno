/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeradores.RolesPersona;
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
@Table(name = "alumnos")
public class AlumnoEntidad extends PersonaEntidad implements Serializable {

    @Column(name = "correo", nullable = false)
    private String correo;
    
    @OneToMany(mappedBy = "alumno", cascade = {CascadeType.PERSIST})
    private List<PrestamoEntidad> prestamo;

    @OneToMany(mappedBy = "alumno", cascade = {CascadeType.PERSIST})
    private List<VentaEntidad> venta;

    public AlumnoEntidad() {
    }

    public AlumnoEntidad(String correo, List<PrestamoEntidad> prestamo) {
        this.correo = correo;
        this.prestamo = prestamo;
    }

    public AlumnoEntidad(String correo, List<PrestamoEntidad> prestamo, String nombreUsuario, RolesPersona rol, String password) {
        super(nombreUsuario, rol, password);
        this.correo = correo;
        this.prestamo = prestamo;
    }

    public AlumnoEntidad(List<PrestamoEntidad> prestamo, String nombreUsuario, RolesPersona rol, String password) {
        super(nombreUsuario, rol, password);
        this.prestamo = prestamo;
    }

    public List<VentaEntidad> getVenta() {
        return venta;
    }

    public void setVenta(List<VentaEntidad> venta) {
        this.venta = venta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public List<PrestamoEntidad> getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(List<PrestamoEntidad> prestamo) {
        this.prestamo = prestamo;
    }

}

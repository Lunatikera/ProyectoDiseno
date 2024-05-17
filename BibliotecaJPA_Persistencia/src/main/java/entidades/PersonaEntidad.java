/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeradores.RolesPersona;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "personas")
public class PersonaEntidad implements Serializable {

    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;

    @Column(name = "nombreUsuario", unique = true, nullable = false)
    private String nombreUsuario;

    @Column(name = "rol", nullable = false)
    @Enumerated(EnumType.STRING)
    private RolesPersona rol;

    @Column(name = "password", nullable = false)
    private String password;

    public PersonaEntidad() {
    }

    public PersonaEntidad(String nombreUsuario, RolesPersona rol, String password) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.rol=rol;
    }

    public Long getId() {
        return id_persona;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public RolesPersona getRol() {
        return rol;
    }

    public void setRol(RolesPersona rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id_persona = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_persona != null ? id_persona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaEntidad)) {
            return false;
        }
        PersonaEntidad other = (PersonaEntidad) object;
        if ((this.id_persona == null && other.id_persona != null) || (this.id_persona != null && !this.id_persona.equals(other.id_persona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PersonaEntidad[ id=" + id_persona + " ]";
    }

}

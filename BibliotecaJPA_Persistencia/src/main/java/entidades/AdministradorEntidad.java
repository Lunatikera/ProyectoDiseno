/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeradores.RolesPersona;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "administradores")
public class AdministradorEntidad extends PersonaEntidad implements Serializable {

    public AdministradorEntidad() {
    }

    public AdministradorEntidad(String nombreUsuario, RolesPersona rol, String password) {
        super(nombreUsuario, rol, password);
    }

   
}

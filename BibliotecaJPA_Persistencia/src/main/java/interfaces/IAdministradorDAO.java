/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.AdministradorEntidad;
import excepciones.AdministradorExcepcion;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IAdministradorDAO {

    public List<AdministradorEntidad> listaAdministradores() throws AdministradorExcepcion;

}

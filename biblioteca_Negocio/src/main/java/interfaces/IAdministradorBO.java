/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.AdministradorInicioSesionDTO;
import Excepcion.NegocioException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IAdministradorBO {

    public List<AdministradorInicioSesionDTO> listaAdministradores() throws NegocioException;

}

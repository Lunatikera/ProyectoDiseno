/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.AdministradorDTO;
import Excepcion.NegocioException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IAdministradorBO {

    public List<AdministradorDTO> listaAdministradores() throws NegocioException;

}

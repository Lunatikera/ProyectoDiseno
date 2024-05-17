/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.TablaPrestamoLibroDTO;
import Excepcion.NegocioException;
import entidades.PrestamoEntidad;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IPrestamosBO {

    public List<TablaPrestamoLibroDTO> consultarPrestamosPorISBN(String isbn) throws NegocioException;

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.TablaVentaLibroDTO;
import DTO.VentaDTO;
import Excepcion.NegocioException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IVentasBO {

    public List<TablaVentaLibroDTO> consultarVentasPorISBN(String isbn) throws NegocioException;

    public void agregarVenta(VentaDTO venta) throws NegocioException;

}

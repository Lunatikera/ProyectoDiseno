/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.VentaEntidad;
import excepciones.VentaException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IVentaDAO {

    public List<Object[]> consultarVentaPorISBN(String isbn) throws VentaException;

    public void agregarVenta(VentaEntidad venta) throws VentaException;
}

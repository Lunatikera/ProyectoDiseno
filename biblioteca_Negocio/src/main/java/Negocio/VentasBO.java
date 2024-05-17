/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import DTO.TablaVentaLibroDTO;
import Excepcion.NegocioException;
import convertidores.TablaVentaConverter;
import dao.VentaDAO;
import excepciones.VentaException;
import interfaces.IVentaDAO;
import interfaces.IVentasBO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class VentasBO implements IVentasBO {

    private IVentaDAO ventaDAO;

    public VentasBO() {
        this.ventaDAO = new VentaDAO();
    }

    @Override
    public List<TablaVentaLibroDTO> consultarVentasPorISBN(String isbn) throws NegocioException {
        List<TablaVentaLibroDTO> lista = new ArrayList<>();
        try {
            List<Object[]> listaPrestamos = ventaDAO.consultarVentaPorISBN(isbn);
            for (Object[] listaPrestamo : listaPrestamos) {
                TablaVentaLibroDTO tablaPrestamoLibro = TablaVentaConverter.convertirConsultaATablaVenta(listaPrestamo);
                lista.add(tablaPrestamoLibro);
            }
            return lista;
        } catch (VentaException e) {
            throw new NegocioException("NO se puedo recolectar la informacion de los prestamos");
        }
    }
}



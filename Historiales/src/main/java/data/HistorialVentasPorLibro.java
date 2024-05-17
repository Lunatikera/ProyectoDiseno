/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import DTO.LibroDTO;
import DTO.TablaVentaLibroDTO;
import Excepcion.NegocioException;
import Negocio.LibroBO;
import Negocio.VentasBO;
import excepciones.HistorialFiltrarLibrosExcepcion;
import excepciones.HistorialVentasExcepciones;
import interfaces.ILibroBO;
import interfaces.IVentasBO;
import interfaz.IHistorialVentasService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class HistorialVentasPorLibro implements IHistorialVentasService{
    ILibroBO libroBO;
    IVentasBO ventasBO;

    public HistorialVentasPorLibro() {
        this.libroBO = new LibroBO();
        this.ventasBO = new VentasBO();
    }
     public LibroDTO consultarLibro(String isbn) throws HistorialVentasExcepciones {
        try {
            return libroBO.consultarLibro(isbn);
        } catch (NegocioException ex) {
            throw new HistorialVentasExcepciones("Error al consultar el libro");
        }
    }
     
     public List<TablaVentaLibroDTO> consultarVentasPorISBN(String isbn) throws HistorialVentasExcepciones {
        try {
            return ventasBO.consultarVentasPorISBN(isbn);
        } catch (NegocioException ex) {
            throw new HistorialVentasExcepciones("Error al consultar el libro");
        }
     }
    
}

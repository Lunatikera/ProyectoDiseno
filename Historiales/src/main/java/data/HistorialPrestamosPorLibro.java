/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import DTO.LibroDTO;
import DTO.TablaPrestamoLibroDTO;
import Excepcion.NegocioException;
import Negocio.LibroBO;
import Negocio.PrestamoBO;
import excepciones.HistorialFiltrarLibrosExcepcion;
import excepciones.HistorialPrestamosExcepciones;
import interfaces.ILibroBO;
import interfaces.IPrestamosBO;
import interfaz.IHistorialPrestamosService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class HistorialPrestamosPorLibro implements IHistorialPrestamosService{

    private static final Logger LOGGER = Logger.getLogger(HistorialPrestamosPorLibro.class.getName());

    private ILibroBO libroBO;
    private IPrestamosBO prestamoBO;

    public HistorialPrestamosPorLibro() {
        libroBO= new LibroBO();
        prestamoBO=new PrestamoBO();
    }

    public LibroDTO consultarLibro(String isbn) throws HistorialPrestamosExcepciones {
        try {
            return libroBO.consultarLibro(isbn);
        } catch (NegocioException e) {
            throw new HistorialPrestamosExcepciones("Error al consultar el libro: " + e.getMessage());
        }
    }

    public List<TablaPrestamoLibroDTO> consultarPrestamosPorISBN(String isbn) throws HistorialPrestamosExcepciones {
        try {
            LOGGER.info("Consultando libro con ISBN: " + isbn);
            return prestamoBO.consultarPrestamosPorISBN(isbn);
        } catch (NegocioException e) {
            LOGGER.log(Level.SEVERE, "Error al consultar el libro: " + e.getMessage(), e);
            throw new HistorialPrestamosExcepciones("Error al consultar los prestamos por isbn: " + e.getMessage());
        }
    }
}

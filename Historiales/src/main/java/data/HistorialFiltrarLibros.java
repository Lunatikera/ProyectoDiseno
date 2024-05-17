/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import DTO.LibroDTO;
import DTO.TablaLibroDTO;
import Excepcion.NegocioException;
import Negocio.LibroBO;
import excepciones.HistorialFiltrarLibrosExcepcion;
import excepciones.HistorialVentasExcepciones;
import interfaces.ILibroBO;
import interfaz.IHistorialLibrosService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class HistorialFiltrarLibros implements IHistorialLibrosService{

    private ILibroBO libroBO;

    public HistorialFiltrarLibros() {
        this.libroBO = new LibroBO();
    }

    public List<TablaLibroDTO> TablaLibros() throws HistorialFiltrarLibrosExcepcion {
        try {
            return libroBO.TablaLibros();
        } catch (NegocioException ex) {
            throw new HistorialFiltrarLibrosExcepcion("Error al consultar la tabla de libros");
        }
    }
}

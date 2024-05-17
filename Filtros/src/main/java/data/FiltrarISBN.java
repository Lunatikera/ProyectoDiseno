/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import DTO.LibroDTO;
import Excepcion.NegocioException;
import Negocio.LibroBO;
import excepciones.FlitroException;
import interfaces.IFiltrarISBNServices;
import interfaces.ILibroBO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class FiltrarISBN implements IFiltrarISBNServices{

    ILibroBO libroBO;

    public FiltrarISBN() {
        libroBO = new LibroBO();

    }

    public LibroDTO consultarLibro(String isbn) throws FlitroException {
        try {
            return libroBO.consultarLibro(isbn);
        } catch (NegocioException ex) {
            throw new FlitroException("Error al filtrar libros por isbn: " + ex.getMessage());
        }
    }
}

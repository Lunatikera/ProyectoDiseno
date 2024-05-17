/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import DTO.LibroDTO;
import Excepcion.NegocioException;
import Negocio.LibroBO;
import excepciones.FlitroException;
import interfaces.IFiltrarGeneroServices;
import interfaces.ILibroBO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class FiltrarGenero implements IFiltrarGeneroServices {

    ILibroBO libroBO;

    public FiltrarGenero() {
        libroBO = new LibroBO();

    }

    public List<LibroDTO> listaLibrosGenero(String genero) throws FlitroException {
        try {
            return libroBO.listaLibrosGenero(genero);
        } catch (NegocioException ex) {
            throw new FlitroException("Error al filtrar libros por género: " + ex.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import DTO.LibroDTO;
import Excepcion.NegocioException;
import Negocio.LibroBO;
import excepciones.FlitroException;
import interfaces.IFiltrarPaginado;
import interfaces.ILibroBO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class FiltrarPaginado implements IFiltrarPaginado{

    ILibroBO libroBO;

    public FiltrarPaginado() {
        libroBO = new LibroBO();
    }

    public List<LibroDTO> listaLibros() throws FlitroException {
        try {
            return libroBO.listaLibros();
        } catch (NegocioException ex) {
            throw new FlitroException("Error al filtrar los libros" + ex.getMessage());
        }
    }
}

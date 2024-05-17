/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import DTO.LibroDTO;
import Excepcion.NegocioException;
import Negocio.LibroBO;
import excepciones.FlitroException;
import interfaces.IFiltrarTituloServices;
import interfaces.ILibroBO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class FiltrarTitulo implements IFiltrarTituloServices {

    ILibroBO libroBO;

    public FiltrarTitulo() {
        libroBO = new LibroBO();

    }

    public List<LibroDTO> listaLibrosTitulo(String titulo) throws FlitroException {
        try {
            return libroBO.listaLibrosTitulo(titulo);
        } catch (NegocioException ex) {
            throw new FlitroException("Error al filtrar libros por titulo: " + ex.getMessage());
        }
    }

}

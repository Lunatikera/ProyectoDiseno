/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.LibroDTO;
import DTO.TablaLibroDTO;
import Excepcion.NegocioException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ILibroBO {

    public void agregarLibro(LibroDTO libro) throws NegocioException;

    public void actualizarLibro(LibroDTO libro) throws NegocioException;

    public void eliminarLibro(String ISBN) throws NegocioException;

    public LibroDTO consultarLibro(String ISBN) throws NegocioException;

    public List<LibroDTO> listaLibros() throws NegocioException;

    public List<LibroDTO> paginadoLibros(int limit, int offset) throws NegocioException;

    public List<TablaLibroDTO> TablaLibros() throws NegocioException;

    public List<LibroDTO> listaLibrosTitulo(String titulo) throws NegocioException;

  public List<LibroDTO> listaLibrosGenero(String genero) throws NegocioException;
}

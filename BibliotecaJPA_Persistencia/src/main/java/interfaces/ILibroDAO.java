/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.LibroEntidad;
import excepciones.LibroExcepcion;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ILibroDAO {

    public void agregarLibro(LibroEntidad libro) throws LibroExcepcion;

    public void actualizarLibro(LibroEntidad libro) throws LibroExcepcion;

    public void eliminarLibro(String ISBN) throws LibroExcepcion;

    public LibroEntidad consultarLibro(String ISBN) throws LibroExcepcion;

    public List<LibroEntidad> listaLibros() throws LibroExcepcion;

    public List<LibroEntidad> paginadoLibros(int limit, int offset) throws LibroExcepcion;

    public List<LibroEntidad> listaLibrosTitulo(String titulo) throws LibroExcepcion;

    public List<LibroEntidad> listaLibrosGenero(String genero) throws LibroExcepcion;
}

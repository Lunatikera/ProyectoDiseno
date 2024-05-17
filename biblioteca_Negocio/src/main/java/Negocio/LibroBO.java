/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import DTO.LibroDTO;
import DTO.TablaLibroDTO;
import Excepcion.NegocioException;
import convertidores.LibroConverter;
import static convertidores.LibroConverter.convertirLibroALibroDTO;
import static convertidores.LibroConverter.convertirLibroDTOALibro;
import convertidores.TablaLibroConverter;
import dao.LibroDAO;
import entidades.LibroEntidad;
import excepciones.LibroExcepcion;
import interfaces.ILibroBO;
import interfaces.ILibroDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author skevi
 */
public class LibroBO implements ILibroBO {

    private ILibroDAO libroDAO;

    public LibroBO() {
        this.libroDAO = new LibroDAO();
    }

    @Override
    public void agregarLibro(LibroDTO libroDTO) throws NegocioException {
        try {
            libroDAO.agregarLibro(convertirLibroDTOALibro(libroDTO));
        } catch (LibroExcepcion ex) {
            throw new NegocioException("No se pudo agregar el libro");
        }
    }

    @Override
    public void actualizarLibro(LibroDTO libroDTO) throws NegocioException {
        try {
            libroDAO.actualizarLibro(convertirLibroDTOALibro(libroDTO));
        } catch (LibroExcepcion ex) {
            throw new NegocioException("No se pudo actualizar el libro");
        }
    }

    @Override
    public void eliminarLibro(String isbn) throws NegocioException {
        try {
            libroDAO.eliminarLibro(isbn);
        } catch (LibroExcepcion ex) {
            throw new NegocioException("No se pudo eliminar el libro");
        }
    }

    @Override
    public LibroDTO consultarLibro(String isbn) throws NegocioException {
        try {
            LibroDTO libro = convertirLibroALibroDTO(libroDAO.consultarLibro(isbn));
            return libro;
        } catch (LibroExcepcion ex) {
            throw new NegocioException("No se pudo consultar el libro");
        }
    }

    @Override
    public List<LibroDTO> listaLibros() throws NegocioException {
        List<LibroDTO> librosDTO = new ArrayList<>();

        try {
            List<LibroEntidad> librosEntidad = libroDAO.listaLibros();
            for (LibroEntidad libroEntidad : librosEntidad) {
                LibroDTO libroDTO = LibroConverter.convertirLibroALibroDTO(libroEntidad);
                librosDTO.add(libroDTO);
            }
        } catch (LibroExcepcion ex) {
            throw new NegocioException("No se pudo consultar la lista de libros");
        }
        return librosDTO;
    }

    @Override
    public List<TablaLibroDTO> TablaLibros() throws NegocioException {
        List<TablaLibroDTO> tablaLibrosDTO = new ArrayList<>();
        try {
            List<LibroEntidad> librosEntidad = libroDAO.listaLibros();
            for (LibroEntidad libroEntidad : librosEntidad) {
                TablaLibroDTO tablaLibroDTO = TablaLibroConverter.convertirLibroALibroDTO(libroEntidad);
                tablaLibrosDTO.add(tablaLibroDTO);
            }
        } catch (LibroExcepcion ex) {
            throw new NegocioException("No se pudo obtener la lista de libros");
        }
        return tablaLibrosDTO;
    }

    @Override
    public List<LibroDTO> paginadoLibros(int limit, int offset) throws NegocioException {
        List<LibroDTO> paginadolibrosDTO = new ArrayList<>();
        try {
            List<LibroEntidad> librosEntidad = libroDAO.paginadoLibros(limit, offset);
            for (LibroEntidad libroEntidad : librosEntidad) {
                LibroDTO libroDTO = LibroConverter.convertirLibroALibroDTO(libroEntidad);
                paginadolibrosDTO.add(libroDTO);
            }
        } catch (LibroExcepcion ex) {
            throw new NegocioException("No se pudo consultar la lista de libros");
        }
        return paginadolibrosDTO;
    }

    @Override
    public List<LibroDTO> listaLibrosTitulo(String titulo) throws NegocioException {
        List<LibroDTO> librosDTO = new ArrayList<>();

        try {
            List<LibroEntidad> librosEntidad = libroDAO.listaLibrosTitulo(titulo);
            for (LibroEntidad libroEntidad : librosEntidad) {
                LibroDTO libroDTO = LibroConverter.convertirLibroALibroDTO(libroEntidad);
                librosDTO.add(libroDTO);
            }
        } catch (LibroExcepcion ex) {
            throw new NegocioException("No se pudo consultar la lista de libros por titulo");
        }
        return librosDTO;
    }

    @Override
    public List<LibroDTO> listaLibrosGenero(String genero) throws NegocioException {
        List<LibroDTO> librosDTO = new ArrayList<>();

        try {
            List<LibroEntidad> librosEntidad = libroDAO.listaLibrosGenero(genero);
            for (LibroEntidad libroEntidad : librosEntidad) {
                LibroDTO libroDTO = LibroConverter.convertirLibroALibroDTO(libroEntidad);
                librosDTO.add(libroDTO);
            }
        } catch (LibroExcepcion ex) {
            throw new NegocioException("No se pudo consultar la lista de libros por genero2");
        }
        return librosDTO;
    }
    
}

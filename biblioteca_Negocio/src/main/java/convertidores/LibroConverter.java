/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.LibroDTO;
import entidades.LibroEntidad;
import enumeradores.GeneroLibros;

/**
 *
 * @author Usuario
 */
public class LibroConverter {

    public static LibroDTO convertirLibroALibroDTO(LibroEntidad libro) {
        LibroDTO libroDTO = new LibroDTO();
        libroDTO.setISBNDTO(libro.getIsbn());
        libroDTO.setTituloDTO(libro.getTitulo());
        libroDTO.setEditorialDTO(libro.getEditorial());
        libroDTO.setPortadaDTO(libro.getPortada());
        libroDTO.setGeneroDTO(libro.getGenero().toString());
        libroDTO.setAutorDTO(libro.getAutor());
        libroDTO.setPaginasDTO(libro.getNumPaginas());
        libroDTO.setFechaDTO(libro.getFechaPublicacion());
        return libroDTO;
    }

    public static LibroEntidad convertirLibroDTOALibro(LibroDTO libroDTO) {
        LibroEntidad libro = new LibroEntidad();
        libro.setIsbn(libroDTO.getISBNDTO());
        libro.setPortada(libroDTO.getPortadaDTO());
        libro.setTitulo(libroDTO.getTituloDTO());
        libro.setAutor(libroDTO.getAutorDTO());
        libro.setEditorial(libroDTO.getEditorialDTO());
        libro.setGenero(GeneroLibros.valueOf(libroDTO.getGeneroDTO()));
        libro.setNumPaginas(libroDTO.getPaginasDTO());
        libro.setFechaPublicacion(libroDTO.getFechaDTO());

        return libro;
    }

}

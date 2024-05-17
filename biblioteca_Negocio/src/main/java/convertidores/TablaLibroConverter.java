/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.TablaLibroDTO;
import entidades.LibroEntidad;
import enumeradores.GeneroLibros;

/**
 *
 * @author Usuario
 */
public class TablaLibroConverter {

    public static TablaLibroDTO convertirLibroALibroDTO(LibroEntidad libro) {
        TablaLibroDTO libroDTO = new TablaLibroDTO();
        libroDTO.setISBNDTO(libro.getIsbn());
        libroDTO.setTituloDTO(libro.getTitulo());
        libroDTO.setGeneroDTO(libro.getGenero().toString());
        libroDTO.setAutorDTO(libro.getAutor());
        libroDTO.setEditorialDTO(libro.getEditorial());
        libroDTO.setFechaDTO(libro.getFechaPublicacion());

        return libroDTO;
    }

    public static LibroEntidad convertirLibroDTOALibro(TablaLibroDTO libroDTO) {
        LibroEntidad libro = new LibroEntidad();
        libro.setIsbn(libroDTO.getISBNDTO());
        libro.setTitulo(libroDTO.getTituloDTO());
        libro.setAutor(libroDTO.getAutorDTO());
        libro.setEditorial(libroDTO.getEditorialDTO());
        libro.setGenero(GeneroLibros.valueOf(libroDTO.getGeneroDTO()));
        libro.setFechaPublicacion(libroDTO.getFechaDTO());
        return libro;
    }

}

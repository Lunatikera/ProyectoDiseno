/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import DTO.LibroDTO;
import DTO.TablaPrestamoLibroDTO;
import excepciones.HistorialPrestamosExcepciones;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IHistorialPrestamosService {

    public List<TablaPrestamoLibroDTO> consultarPrestamosPorISBN(String isbn) throws HistorialPrestamosExcepciones;

    public LibroDTO consultarLibro(String isbn) throws HistorialPrestamosExcepciones;
}

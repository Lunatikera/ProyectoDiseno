/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import DTO.LibroDTO;
import DTO.TablaVentaLibroDTO;
import excepciones.HistorialVentasExcepciones;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IHistorialVentasService {

    public LibroDTO consultarLibro(String isbn) throws HistorialVentasExcepciones;

    public List<TablaVentaLibroDTO> consultarVentasPorISBN(String isbn) throws HistorialVentasExcepciones;
}

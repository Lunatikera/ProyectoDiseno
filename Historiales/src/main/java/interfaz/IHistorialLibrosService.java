/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import DTO.TablaLibroDTO;
import excepciones.HistorialFiltrarLibrosExcepcion;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IHistorialLibrosService {

    public List<TablaLibroDTO> TablaLibros() throws HistorialFiltrarLibrosExcepcion;

}

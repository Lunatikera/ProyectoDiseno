/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import DTO.AlumnoAdeudoDTO;
import excepciones.HistorialAlumnoExcepciones;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IHistorialAdeudoService {

    public List<AlumnoAdeudoDTO> listaAlumnosAdeudo() throws HistorialAlumnoExcepciones;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import DTO.AlumnoAdeudoDTO;
import Excepcion.NegocioException;
import Negocio.AlumnoBO;
import excepciones.HistorialAlumnoExcepciones;
import interfaces.IAlumnoBO;
import interfaz.IHistorialAdeudoService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class HistorialAdeudoPorAlumno implements IHistorialAdeudoService{

    IAlumnoBO alumnoBO;

    public HistorialAdeudoPorAlumno() {
        this.alumnoBO = new AlumnoBO();
    }

    public List<AlumnoAdeudoDTO> listaAlumnosAdeudo() throws HistorialAlumnoExcepciones {
        try {
            return alumnoBO.listaAlumnosAdeudo();
        } catch (NegocioException ex) {
            throw new HistorialAlumnoExcepciones("Error al consultar la tabla de adeudo: " + ex.getMessage());
        }

    }
}

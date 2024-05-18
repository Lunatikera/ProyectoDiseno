/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import DTO.AlumnoAdeudoDTO;
import DTO.AlumnoInicioSesionDTO;
import DTO.AlumnoPrestamoDTO;
import Excepcion.NegocioException;
import convertidores.AlumnoAdeudoConverter;
import convertidores.AlumnoIniciarSesionConverter;
import convertidores.AlumnoPrestamoVentaConvertidor;
import dao.AlumnoDAO;
import entidades.AlumnoEntidad;
import excepciones.AlumnoExcepcion;
import interfaces.IAlumnoBO;
import interfaces.IAlumnoDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author skevi
 */
public class AlumnoBO implements IAlumnoBO {

    private IAlumnoDAO alumnoDAO;

    public AlumnoBO() {
        this.alumnoDAO = new AlumnoDAO();
    }

    @Override
    public List<AlumnoInicioSesionDTO> listaAlumnosInicioSesion() throws NegocioException {
        List<AlumnoInicioSesionDTO> alumnosDTO = new ArrayList<>();

        try {
            List<AlumnoEntidad> alumnosEntidad = alumnoDAO.listaAlumnos();
            for (AlumnoEntidad alumnoEntidad : alumnosEntidad) {
                AlumnoInicioSesionDTO alumnoDTO = AlumnoIniciarSesionConverter.convertirAlumnoAAlumnoDTO(alumnoEntidad);
                alumnosDTO.add(alumnoDTO);
            }
        } catch (AlumnoExcepcion ex) {
            throw new NegocioException("Error al obtener la lista de alumnos");
        }
        return alumnosDTO;
    }

    @Override
    public List<AlumnoAdeudoDTO> listaAlumnosAdeudo() throws NegocioException {
        List<AlumnoAdeudoDTO> alumnosDTO = new ArrayList<>();

        try {
            List<Object[]> alumnosEntidad = alumnoDAO.obtenerSumaCuotasAdeudadasPorUsuario();
            for (Object[] alumnoEntidad : alumnosEntidad) {
                AlumnoAdeudoDTO alumnoDTO = AlumnoAdeudoConverter.convertirAlumnoAAlumnoAdeudoDTO(alumnoEntidad);
                alumnosDTO.add(alumnoDTO);
            }
        } catch (AlumnoExcepcion ex) {
            throw new NegocioException("Error al obtener la lista de alumnos por adeudo");
        }
        return alumnosDTO;
    }

    @Override
    public AlumnoAdeudoDTO consultarAlumno(String nombreUsuario) throws NegocioException {
        try {
            AlumnoAdeudoDTO alumno = AlumnoAdeudoConverter.convertirAlumnoAAlumnoDTO(alumnoDAO.consultarAlumno(nombreUsuario));
            return alumno;
        } catch (AlumnoExcepcion ex) {
            throw new NegocioException("No se pudo consultar al alumno");
        }
    }
    
     @Override
    public AlumnoPrestamoDTO consultarAlumnoPrestamo(String nombreUsuario) throws NegocioException {
        try {
            AlumnoPrestamoDTO alumno = AlumnoPrestamoVentaConvertidor.convertirAlumnoAAlumnoDTO(alumnoDAO.consultarAlumno(nombreUsuario));
            return alumno;
        } catch (AlumnoExcepcion ex) {
            throw new NegocioException("No se pudo consultar al alumno para prestamo");
        }
    }

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import DTO.AlumnoPrestamoDTO;
import DTO.LibroDTO;
import exception.PrestamoServiceException;

/**
 *
 * @author Usuario
 */
public interface IPrestamoService {

    public void prestarLibro(Long idCopiaLibro, Long idAlumno) throws PrestamoServiceException;

    public LibroDTO consultarLibro(String isbn) throws PrestamoServiceException;

    public AlumnoPrestamoDTO consultarAlumnoPrestamo(String nomUsuario) throws PrestamoServiceException;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import DTO.AlumnoPrestamoDTO;
import DTO.LibroDTO;
import execption.VentaServiceException;

/**
 *
 * @author Usuario
 */
public interface IVentaServices {

    public void venderLibro(Long idCopiaLibro, Long idAlumno, double precio) throws VentaServiceException;

    public LibroDTO consultarLibro(String isbn) throws VentaServiceException;

    public AlumnoPrestamoDTO consultarAlumnoVenta(String nomUsuario) throws VentaServiceException;
}

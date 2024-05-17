/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.PrestamoEntidad;
import excepciones.PrestamoException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IPrestamosDAO {
    public List<Object[]> consultarPrestamosPorISBN(String isbn) throws PrestamoException;
    public void agregarPrestamo(PrestamoEntidad prestamo) throws PrestamoException;
}

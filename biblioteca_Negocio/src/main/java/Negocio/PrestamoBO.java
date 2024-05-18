/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import DTO.PrestamoDTO;
import DTO.TablaPrestamoLibroDTO;
import Excepcion.NegocioException;
import convertidores.PrestamoConverter;
import convertidores.TablaPrestamoConvertidor;
import dao.PrestamosDAO;
import excepciones.PrestamoException;
import interfaces.IPrestamosBO;
import interfaces.IPrestamosDAO;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author skevi
 */
public class PrestamoBO implements IPrestamosBO {

    private IPrestamosDAO prestamoDAO;

    public PrestamoBO() {
        this.prestamoDAO = new PrestamosDAO();
    }

    @Override
    public List<TablaPrestamoLibroDTO> consultarPrestamosPorISBN(String isbn) throws NegocioException {
        List<TablaPrestamoLibroDTO> lista = new ArrayList<>();
        try {
            List<Object[]> listaPrestamos = prestamoDAO.consultarPrestamosPorISBN(isbn);
            for (Object[] listaPrestamo : listaPrestamos) {
                TablaPrestamoLibroDTO tablaPrestamoLibro = TablaPrestamoConvertidor.convertirConsultaATablaPrestamos(listaPrestamo);
                lista.add(tablaPrestamoLibro);
            }
            return lista;
        } catch (PrestamoException e) {
            throw new NegocioException("NO se puedo recolectar la informacion de los prestamos");
        }
    }

    public void agregarPrestamo(PrestamoDTO prestamo) throws NegocioException {
        try {
            prestamoDAO.agregarPrestamo(PrestamoConverter.convertirPrestamoDTOAPrestamo(prestamo));
        } catch (PrestamoException ex) {
            throw new NegocioException("NO se puedo agregar la informacion de los prestamos");
        }
      
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.LibroDTO;
import excepciones.FlitroException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IFiltrarGeneroServices {

    public List<LibroDTO> listaLibrosGenero(String genero) throws FlitroException;

    }

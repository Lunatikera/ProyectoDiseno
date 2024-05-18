/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import DTO.AdministradorInicioSesionDTO;
import Excepcion.NegocioException;
import convertidores.AdministradorConverter;
import dao.AdministradorDAO;
import entidades.AdministradorEntidad;
import excepciones.AdministradorExcepcion;
import interfaces.IAdministradorBO;
import interfaces.IAdministradorDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skevi
 */
public class AdministradorBO implements IAdministradorBO {

    private IAdministradorDAO administradorDAO;

    public AdministradorBO() {
        this.administradorDAO = new AdministradorDAO();
    }

    @Override
    public List<AdministradorInicioSesionDTO> listaAdministradores() throws NegocioException {
        List<AdministradorInicioSesionDTO> administradoresDTO = new ArrayList<>();

        try {
            List<AdministradorEntidad> administradoresEntidad = administradorDAO.listaAdministradores();
            for (AdministradorEntidad administradorEntidad : administradoresEntidad) {
                AdministradorInicioSesionDTO administradorDTO = AdministradorConverter.convertirAdministradorAAdministradorDTO(administradorEntidad);
                administradoresDTO.add(administradorDTO);
            }
        } catch (AdministradorExcepcion ex) {
            throw new NegocioException("Error al obtener la lista de administradores");
        }
        return administradoresDTO;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.AdministradorEntidad;
import excepciones.AdministradorExcepcion;
import interfaces.IAdministradorDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public class AdministradorDAO implements IAdministradorDAO {

    private EntityManagerFactory entityManagerFactory;

    public AdministradorDAO() {
        this.entityManagerFactory = Conexion.getInstance();
    }

    @Override
    public List<AdministradorEntidad> listaAdministradores() throws AdministradorExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createQuery("SELECT a FROM Administrador a");
            return query.getResultList();
        } catch (Exception e) {
            throw new AdministradorExcepcion("Error al obtener la lista de administradores");
        }
    }
}

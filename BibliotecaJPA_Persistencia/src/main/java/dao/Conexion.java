/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Usuario
 */
public class Conexion  {
   
    private static final String PERSISTENCE_UNIT_NAME = "BibliotecaJPA";
    private static EntityManagerFactory entityManagerFactory;

    private Conexion() {
        entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    public static synchronized EntityManagerFactory getInstance() {
        if (entityManagerFactory == null) {
            // Si entityManagerFactory es nulo, creamos una nueva instancia de la clase Conexion
            // y esto inicializará entityManagerFactory
            new Conexion();
        }
        return entityManagerFactory;
    }

    public EntityManager establecerConexion() {
        return entityManagerFactory.createEntityManager();
    }

    public static void close() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}
    




    

 

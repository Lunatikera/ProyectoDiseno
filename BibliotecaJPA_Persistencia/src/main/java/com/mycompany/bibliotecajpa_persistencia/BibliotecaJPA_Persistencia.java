/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.bibliotecajpa_persistencia;

import dao.LibroDAO;
import entidades.LibroEntidad;
import excepciones.LibroExcepcion;
import interfaces.ILibroDAO;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class BibliotecaJPA_Persistencia {

    public static void main(String[] args) throws LibroExcepcion {
        ILibroDAO libroDAO = new LibroDAO();
        Calendar fecha = Calendar.getInstance();
        fecha.set(2000, 10, 19);
    }
}

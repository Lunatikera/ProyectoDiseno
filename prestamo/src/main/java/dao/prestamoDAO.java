/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import prestamo.Prestamo;

/**
 *
 * @author skevi
 */
public class prestamoDAO {
    
    public void agregarPrestamo(Prestamo prestamo) {
        // Sentencia SQL para insertar un nuevo préstamo
        String sql = "INSERT INTO PRESTAMOS (FECHAPRESTAMO, FECHADEVOLUCION, idAlumno, idLibro) VALUES (?, ?, ?, ?)";

        // Obtener la conexión
        Connection conexion = Conexion.obtenerConexion();

        try {
            // Preparar la sentencia SQL
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setDate(1, prestamo.getFechaPrestamo());
            statement.setDate(2, prestamo.getFechaDevolucion());
            statement.setInt(3, prestamo.getIdAlumno());
            statement.setInt(4, prestamo.getIdLibro());

            // Ejecutar la sentencia SQL
            statement.executeUpdate();
            System.out.println("Préstamo registrado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al agregar el préstamo: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            Conexion.cerrarConexion(conexion);
        }
    }
    
}

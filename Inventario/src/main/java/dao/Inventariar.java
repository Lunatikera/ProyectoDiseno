/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import inventario.Inventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author skevi
 */
public class Inventariar {
    
    public void inventariar (Inventario inventario) {
       
        // Sentencia SQL para insertar una nueva entrada en el inventario
        String sql = "INSERT INTO INVENTARIO (cantidad, idLibro) VALUES (?, ?)";

        // Obtener la conexión
        Connection conexion = Conexion.obtenerConexion();

        try {
            // Preparar la sentencia SQL
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, inventario.getCantidad());
            statement.setInt(2, inventario.getIdLibro());

            // Ejecutar la sentencia SQL
            statement.executeUpdate();
            System.out.println("Libro inventariado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al inventariar el libro: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            Conexion.cerrarConexion(conexion);
        }
    }
    
    
    public void desinventariarLibro(int idLibro) {
        // Sentencia SQL para eliminar la entrada del inventario
        String sql = "DELETE FROM INVENTARIO WHERE idLibro=?";

        // Obtener la conexión
        Connection conexion = Conexion.obtenerConexion();

        try {
            // Preparar la sentencia SQL
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idLibro);

            // Ejecutar la sentencia SQL
            int filasEliminadas = statement.executeUpdate();

            // Verificar si se eliminó la entrada del inventario correctamente
            if (filasEliminadas > 0) {
                System.out.println("Libro desinventariado correctamente.");
            } else {
                System.out.println("No se encontró el libro en el inventario.");
            }

        } catch (SQLException e) {
            System.out.println("Error al desinventariar el libro: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            Conexion.cerrarConexion(conexion);
        }
    }
    
}

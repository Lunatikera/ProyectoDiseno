/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author skevi
 */
public class Conexion {
    
    // Detalles de la conexión
    static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    static final String USUARIO = "root";
    static final String CONTRASEÑA = "Saymyname15";

    // Método para establecer la conexión
    public static Connection obtenerConexion() {
        Connection conexion = null;

        try {
            // Registro del controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecimiento de la conexión
            System.out.println("Conectando a la base de datos...");
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);

            if (conexion != null) {
                System.out.println("¡Conexión exitosa!");
            } else {
                System.out.println("No se pudo establecer la conexión.");
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo encontrar la clase del controlador: " + e.getMessage());
        }

        return conexion;
    }

    // Método para cerrar la conexión
    public static void cerrarConexion(Connection conexion) {
        try {
            if (conexion != null) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    
}

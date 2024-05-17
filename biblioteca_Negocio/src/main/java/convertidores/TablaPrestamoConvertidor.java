/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.TablaPrestamoLibroDTO;
import enumeradores.EstadoPrestamo;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class TablaPrestamoConvertidor {
    
  public static TablaPrestamoLibroDTO convertirConsultaATablaPrestamos(Object[] prestamoTabla) {
        TablaPrestamoLibroDTO prestamoDTO = new TablaPrestamoLibroDTO();
    prestamoDTO.setNombreUsuarioDTO((String) prestamoTabla[0]);
   // Convertir LocalDateTime a Timestamp para la fecha de prestamo
    LocalDateTime fechaPrestamoLocalDateTime = (LocalDateTime) prestamoTabla[1];
    Timestamp fechaPrestamoTimestamp = FechaConvertidor.convertirLocalDateTimeATimestamp(fechaPrestamoLocalDateTime);
    prestamoDTO.setFechaPrestamo(fechaPrestamoTimestamp);
    
    // Haz lo mismo para la fecha de devolución
    // Convertir LocalDateTime a Timestamp para la fecha de devolucion
    LocalDateTime fechaDevolucionLocalDateTime = (LocalDateTime) prestamoTabla[2];
    Timestamp fechaDevolucionTimestamp = FechaConvertidor.convertirLocalDateTimeATimestamp(fechaDevolucionLocalDateTime);
    prestamoDTO.setFechaDevolucion(fechaDevolucionTimestamp);
    // No se sabe qué tipo es EstadoPrestamo, asumiendo que es un String
    prestamoDTO.setEstado((String) prestamoTabla[3]);
        
        return prestamoDTO;
    }
   

}
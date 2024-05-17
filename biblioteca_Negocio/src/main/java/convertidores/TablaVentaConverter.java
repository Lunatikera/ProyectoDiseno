/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.TablaVentaLibroDTO;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class TablaVentaConverter {

    public static TablaVentaLibroDTO convertirConsultaATablaVenta(Object[] ventaTabla) {
        TablaVentaLibroDTO ventaDTO = new TablaVentaLibroDTO();
        ventaDTO.setNombreUsuarioDTO((String) ventaTabla[0]);
        LocalDateTime fechaVentaLocalDateTime = (LocalDateTime) ventaTabla[1];
        Timestamp fechaPrestamoTimestamp = FechaConvertidor.convertirLocalDateTimeATimestamp(fechaVentaLocalDateTime);
        ventaDTO.setFechaVentaDTO(fechaPrestamoTimestamp);
        ventaDTO.setPrecioVenta((double) ventaTabla[2]);
        return ventaDTO;
    }

}

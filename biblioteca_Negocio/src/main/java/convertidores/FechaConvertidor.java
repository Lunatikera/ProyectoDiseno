/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class FechaConvertidor {

    public static Timestamp convertirLocalDateTimeATimestamp(LocalDateTime localDateTime) {
        return Timestamp.valueOf(localDateTime);
    }

}

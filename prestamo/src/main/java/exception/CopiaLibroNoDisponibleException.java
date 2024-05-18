/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exception;

/**
 *
 * @author Usuario
 */
public class CopiaLibroNoDisponibleException extends Exception {

    /**
     * Creates a new instance of <code>CopaLibroNoDisponibleException</code>
     * without detail message.
     */
    public CopiaLibroNoDisponibleException() {
    }

    /**
     * Constructs an instance of <code>CopaLibroNoDisponibleException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public CopiaLibroNoDisponibleException(String msg) {
        super(msg);
    }
}

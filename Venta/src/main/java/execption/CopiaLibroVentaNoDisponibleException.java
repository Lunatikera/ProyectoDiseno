/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package execption;

/**
 *
 * @author Usuario
 */
public class CopiaLibroVentaNoDisponibleException extends Exception {

    /**
     * Creates a new instance of <code>CopiaLibroVentaNoDisponible</code>
     * without detail message.
     */
    public CopiaLibroVentaNoDisponibleException() {
    }

    /**
     * Constructs an instance of <code>CopiaLibroVentaNoDisponible</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public CopiaLibroVentaNoDisponibleException(String msg) {
        super(msg);
    }
}

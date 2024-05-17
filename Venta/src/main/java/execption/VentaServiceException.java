/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package execption;

/**
 *
 * @author Usuario
 */
public class VentaServiceException extends Exception {

    /**
     * Creates a new instance of <code>VentaServiceException</code> without
     * detail message.
     */
    public VentaServiceException() {
    }

    /**
     * Constructs an instance of <code>VentaServiceException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public VentaServiceException(String msg) {
        super(msg);
    }
}

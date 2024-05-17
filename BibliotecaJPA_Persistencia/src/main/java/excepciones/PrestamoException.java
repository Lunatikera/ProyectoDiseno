/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package excepciones;

/**
 *
 * @author Usuario
 */
public class PrestamoException extends Exception {

    /**
     * Creates a new instance of <code>PrestamoException</code> without detail
     * message.
     */
    public PrestamoException() {
    }

    /**
     * Constructs an instance of <code>PrestamoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PrestamoException(String msg) {
        super(msg);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package excepciones;

/**
 *
 * @author Usuario
 */
public class AlumnoExcepcion extends Exception {

    /**
     * Creates a new instance of <code>AlumnoExcepcion</code> without detail
     * message.
     */
    public AlumnoExcepcion() {
    }

    /**
     * Constructs an instance of <code>AlumnoExcepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public AlumnoExcepcion(String msg) {
        super(msg);
    }
}

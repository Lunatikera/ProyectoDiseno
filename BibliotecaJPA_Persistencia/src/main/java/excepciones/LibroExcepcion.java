/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package excepciones;

/**
 *
 * @author Usuario
 */
public class LibroExcepcion extends Exception{

    /**
     * Creates a new instance of <code>LibroExcepcion</code> without detail
     * message.
     */
    public LibroExcepcion() {
    }

    /**
     * Constructs an instance of <code>LibroExcepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public LibroExcepcion(String msg) {
        super(msg);
    }
}

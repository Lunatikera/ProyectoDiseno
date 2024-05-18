/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guardado;

/**
 *
 * @author skevi
 */
public class Guardado {

    private static Long idAlumno;
    private static Long idLibro;
    private static Long idAdmin;
    private static String isbn;
    private static String usuarioAlumno;
    private static String usuarioAdministrador;
    private static String genero;
    private static double precioVenta;

    public Guardado() {
    }

    public static void setGenero(String genero) {
        Guardado.genero = genero;
    }

    public static double getPrecioVenta() {
        return precioVenta;
    }

    public static void setPrecioVenta(double precioVenta) {
        Guardado.precioVenta = precioVenta;
    }

    public static String getGenero() {
        return genero;
    }

    public static String getIsbn() {
        return isbn;
    }

    public static void setIsbn(String isbn) {
        Guardado.isbn = isbn;
    }

    public static Long getIdAlumno() {
        return idAlumno;
    }

    public static void setIdAlumno(Long idAlumno) {
        Guardado.idAlumno = idAlumno;
    }

    public static Long getIdLibro() {
        return idLibro;
    }

    public static void setIdLibro(Long idLibro) {
        Guardado.idLibro = idLibro;
    }

    public static Long getIdAdmin() {
        return idAdmin;
    }

    public static void setIdAdmin(Long idAdmin) {
        Guardado.idAdmin = idAdmin;
    }

    public static String getUsuarioAlumno() {
        return usuarioAlumno;
    }

    public static void setUsuarioAlumno(String usuarioAlumno) {
        Guardado.usuarioAlumno = usuarioAlumno;
    }

    public static String getUsuarioAdministrador() {
        return usuarioAdministrador;
    }

    public static void setUsuarioAdministrador(String usuarioAdministrador) {
        Guardado.usuarioAdministrador = usuarioAdministrador;
    }

}

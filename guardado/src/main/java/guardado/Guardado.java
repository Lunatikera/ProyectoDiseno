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
    
    public static int idAlumno;
    private static int idLibro;
    private static int idAdmin;
    private static String isbn;
    private static String correoAlumno;
    private static String genero;

    public Guardado() {
    }

    public Guardado(int idAlumno, int idLibro, int idAdmin) {
        this.idAlumno = idAlumno;
        this.idLibro = idLibro;
        this.idAdmin = idAdmin;
    }


    public int getIdAlumno() {
        return idAlumno;
    }

    public static void setGenero(String genero) {
        Guardado.genero = genero;
    }

    public static String getGenero() {
        return genero;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public static String getIsbn() {
        return isbn;
    }

    public static void setIsbn(String isbn) {
        Guardado.isbn = isbn;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getCorreoAlumno() {
        return correoAlumno;
    }

    public void setCorreoAlumno(String correoAlumno) {
        Guardado.correoAlumno = correoAlumno;
    }
    
    
  
}

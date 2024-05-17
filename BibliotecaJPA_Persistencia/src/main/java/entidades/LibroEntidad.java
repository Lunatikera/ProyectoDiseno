/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeradores.GeneroLibros;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "libros")
public class LibroEntidad implements Serializable {

    @Id
    @Column(name = "id_libro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_libro;

    @Column(name = "isbn", unique = true)
    private String isbn;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "autor")
    private String autor;

    @Column(name = "editorial")
    private String editorial;

    @Column(name = "genero", nullable = false)
    @Enumerated(EnumType.STRING)
    private GeneroLibros genero; 

    @Column(name = "precio")
    private double precio;

    @Column(name = "fechaPublicacion")
    private Calendar fechaPublicacion;

    @Lob
    private byte[] portada;

    @Column(name = "numPaginas")
    private int numPaginas;

    @OneToMany(mappedBy = "libro", cascade = {CascadeType.PERSIST})
    private List<CopiaLibroPrestamoEntidad> copiaLibro;

    public LibroEntidad() {
    }

    public LibroEntidad(String isbn, String titulo, String autor, String editorial, GeneroLibros genero, Calendar fechaPublicaicon, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicaicon;
        this.numPaginas = numPaginas;
    }

    public LibroEntidad(String isbn, String titulo, String autor, String editorial, GeneroLibros genero, Calendar fechaPublicacion, byte[] portada, int numPaginas, List<CopiaLibroPrestamoEntidad> copiaLibro) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        this.portada = portada;
        this.numPaginas = numPaginas;
        this.copiaLibro = copiaLibro;
    }

    public LibroEntidad(String isbn, String titulo, String autor, String editorial, GeneroLibros genero, double precio, Calendar fechaPublicacion, byte[] portada, int numPaginas, List<CopiaLibroPrestamoEntidad> copiaLibro) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
        this.portada = portada;
        this.numPaginas = numPaginas;
        this.copiaLibro = copiaLibro;
    }
    
    

    public LibroEntidad(String isbn, String titulo, String autor, String editorial, GeneroLibros genero, Calendar fechaPublicacion, int numPaginas, List<CopiaLibroPrestamoEntidad> copiaLibro) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        this.numPaginas = numPaginas;
        this.copiaLibro = copiaLibro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public GeneroLibros getGenero() {
        return genero;
    }

    public void setGenero(GeneroLibros genero) {
        this.genero = genero;
    }

    public Calendar getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Calendar fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public List<CopiaLibroPrestamoEntidad> getCopiaLibro() {
        return copiaLibro;
    }

    public byte[] getPortada() {
        return portada;
    }

    public void setPortada(byte[] portada) {
        this.portada = portada;
    }

    public void setCopiaLibro(List<CopiaLibroPrestamoEntidad> copiaLibro) {
        this.copiaLibro = copiaLibro;
    }

    public Long getId() {
        return id_libro;
    }

    public void setId(Long id) {
        this.id_libro = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_libro != null ? id_libro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibroEntidad)) {
            return false;
        }
        LibroEntidad other = (LibroEntidad) object;
        if ((this.id_libro == null && other.id_libro != null) || (this.id_libro != null && !this.id_libro.equals(other.id_libro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.LibroEntidad[ id=" + id_libro + " ]";
    }

}

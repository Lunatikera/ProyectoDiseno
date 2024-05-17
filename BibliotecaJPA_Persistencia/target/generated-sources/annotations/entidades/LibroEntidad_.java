package entidades;

import entidades.CopiaLibroPrestamoEntidad;
import enumeradores.GeneroLibros;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-16T10:14:47", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(LibroEntidad.class)
public class LibroEntidad_ { 

    public static volatile SingularAttribute<LibroEntidad, String> editorial;
    public static volatile SingularAttribute<LibroEntidad, Double> precio;
    public static volatile SingularAttribute<LibroEntidad, Long> id_libro;
    public static volatile SingularAttribute<LibroEntidad, String> isbn;
    public static volatile SingularAttribute<LibroEntidad, GeneroLibros> genero;
    public static volatile SingularAttribute<LibroEntidad, String> titulo;
    public static volatile SingularAttribute<LibroEntidad, Calendar> fechaPublicacion;
    public static volatile SingularAttribute<LibroEntidad, byte[]> portada;
    public static volatile SingularAttribute<LibroEntidad, Integer> numPaginas;
    public static volatile ListAttribute<LibroEntidad, CopiaLibroPrestamoEntidad> copiaLibro;
    public static volatile SingularAttribute<LibroEntidad, String> autor;

}
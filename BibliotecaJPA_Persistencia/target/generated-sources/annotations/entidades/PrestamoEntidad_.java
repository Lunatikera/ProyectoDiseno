package entidades;

import entidades.AlumnoEntidad;
import entidades.CopiaLibroPrestamoEntidad;
import entidades.PrecioAdeudoEntidad;
import enumeradores.EstadoPrestamo;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-16T10:14:47", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(PrestamoEntidad.class)
public class PrestamoEntidad_ { 

    public static volatile SingularAttribute<PrestamoEntidad, Long> id_prestamo;
    public static volatile SingularAttribute<PrestamoEntidad, Calendar> fechaDevolucion;
    public static volatile SingularAttribute<PrestamoEntidad, Calendar> fechaPrestamo;
    public static volatile SingularAttribute<PrestamoEntidad, PrecioAdeudoEntidad> adeudo;
    public static volatile SingularAttribute<PrestamoEntidad, AlumnoEntidad> alumno;
    public static volatile SingularAttribute<PrestamoEntidad, CopiaLibroPrestamoEntidad> copiaLibro;
    public static volatile SingularAttribute<PrestamoEntidad, EstadoPrestamo> rol;

}
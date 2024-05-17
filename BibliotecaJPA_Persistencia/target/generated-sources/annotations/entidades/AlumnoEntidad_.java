package entidades;

import entidades.PrestamoEntidad;
import entidades.VentaEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-16T10:14:47", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(AlumnoEntidad.class)
public class AlumnoEntidad_ extends PersonaEntidad_ {

    public static volatile ListAttribute<AlumnoEntidad, PrestamoEntidad> prestamo;
    public static volatile ListAttribute<AlumnoEntidad, VentaEntidad> venta;
    public static volatile SingularAttribute<AlumnoEntidad, String> correo;
    public static volatile SingularAttribute<AlumnoEntidad, Double> adeudo;

}
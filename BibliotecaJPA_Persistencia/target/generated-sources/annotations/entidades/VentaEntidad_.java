package entidades;

import entidades.AlumnoEntidad;
import entidades.CopiaLibroVentaEntidad;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-16T10:14:47", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(VentaEntidad.class)
public class VentaEntidad_ { 

    public static volatile SingularAttribute<VentaEntidad, AlumnoEntidad> alumno;
    public static volatile SingularAttribute<VentaEntidad, Double> precioVenta;
    public static volatile SingularAttribute<VentaEntidad, Long> id_venta;
    public static volatile SingularAttribute<VentaEntidad, Calendar> fechaVenta;
    public static volatile SingularAttribute<VentaEntidad, CopiaLibroVentaEntidad> copiaLibroVenta;

}
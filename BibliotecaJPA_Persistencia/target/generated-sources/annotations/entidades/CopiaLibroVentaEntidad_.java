package entidades;

import entidades.LibroEntidad;
import entidades.VentaEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-17T09:07:11", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(CopiaLibroVentaEntidad.class)
public class CopiaLibroVentaEntidad_ { 

    public static volatile SingularAttribute<CopiaLibroVentaEntidad, LibroEntidad> libro;
    public static volatile ListAttribute<CopiaLibroVentaEntidad, VentaEntidad> venta;
    public static volatile SingularAttribute<CopiaLibroVentaEntidad, Long> id_copiaLibroVenta;
    public static volatile SingularAttribute<CopiaLibroVentaEntidad, Integer> cantidadDisponible;

}
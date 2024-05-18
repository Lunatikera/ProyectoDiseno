package entidades;

import entidades.LibroEntidad;
import entidades.PrestamoEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-17T09:07:11", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(CopiaLibroPrestamoEntidad.class)
public class CopiaLibroPrestamoEntidad_ { 

    public static volatile SingularAttribute<CopiaLibroPrestamoEntidad, Integer> CantidadTotal;
    public static volatile SingularAttribute<CopiaLibroPrestamoEntidad, Long> id_copiaLibro;
    public static volatile ListAttribute<CopiaLibroPrestamoEntidad, PrestamoEntidad> prestamo;
    public static volatile SingularAttribute<CopiaLibroPrestamoEntidad, LibroEntidad> libro;
    public static volatile SingularAttribute<CopiaLibroPrestamoEntidad, Integer> cantidadDisponible;

}
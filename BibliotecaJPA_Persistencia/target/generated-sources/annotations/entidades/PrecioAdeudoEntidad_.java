package entidades;

import entidades.PrestamoEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-17T09:07:11", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(PrecioAdeudoEntidad.class)
public class PrecioAdeudoEntidad_ { 

    public static volatile ListAttribute<PrecioAdeudoEntidad, PrestamoEntidad> prestamo;
    public static volatile SingularAttribute<PrecioAdeudoEntidad, Double> costo;
    public static volatile SingularAttribute<PrecioAdeudoEntidad, Long> id_adeudo;

}
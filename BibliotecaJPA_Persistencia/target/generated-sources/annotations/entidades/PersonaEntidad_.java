package entidades;

import enumeradores.RolesPersona;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-16T10:14:47", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(PersonaEntidad.class)
public class PersonaEntidad_ { 

    public static volatile SingularAttribute<PersonaEntidad, Long> id_persona;
    public static volatile SingularAttribute<PersonaEntidad, String> password;
    public static volatile SingularAttribute<PersonaEntidad, String> nombreUsuario;
    public static volatile SingularAttribute<PersonaEntidad, RolesPersona> rol;

}
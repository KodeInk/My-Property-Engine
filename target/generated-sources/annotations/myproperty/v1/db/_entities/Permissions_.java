package myproperty.v1.db._entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.PermissionRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-05T13:23:50")
@StaticMetamodel(Permissions.class)
public class Permissions_ { 

    public static volatile CollectionAttribute<Permissions, PermissionRole> permissionRoleCollection;
    public static volatile SingularAttribute<Permissions, String> code;
    public static volatile SingularAttribute<Permissions, String> displayName;
    public static volatile SingularAttribute<Permissions, String> name;
    public static volatile SingularAttribute<Permissions, Integer> id;
    public static volatile SingularAttribute<Permissions, String> grouping;
    public static volatile SingularAttribute<Permissions, String> status;

}
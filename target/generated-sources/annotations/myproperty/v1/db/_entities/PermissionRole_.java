package myproperty.v1.db._entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.Permissions;
import myproperty.v1.db._entities.Roles;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-10T06:38:58")
@StaticMetamodel(PermissionRole.class)
public class PermissionRole_ { 

    public static volatile SingularAttribute<PermissionRole, Roles> role;
    public static volatile SingularAttribute<PermissionRole, Permissions> permission;
    public static volatile SingularAttribute<PermissionRole, Integer> id;

}
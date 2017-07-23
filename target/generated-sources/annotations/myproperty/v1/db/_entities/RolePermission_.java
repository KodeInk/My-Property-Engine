package myproperty.v1.db._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.Permissions;
import myproperty.v1.db._entities.Person;
import myproperty.v1.db._entities.Roles;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-23T22:47:46")
@StaticMetamodel(RolePermission.class)
public class RolePermission_ { 

    public static volatile SingularAttribute<RolePermission, Permissions> permissionId;
    public static volatile SingularAttribute<RolePermission, Date> dateCreated;
    public static volatile SingularAttribute<RolePermission, Roles> roleId;
    public static volatile SingularAttribute<RolePermission, Integer> id;
    public static volatile SingularAttribute<RolePermission, Person> authorId;
    public static volatile SingularAttribute<RolePermission, String> status;

}
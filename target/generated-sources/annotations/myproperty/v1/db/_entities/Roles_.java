package myproperty.v1.db._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.PermissionRole;
import myproperty.v1.db._entities.User;
import myproperty.v1.db._entities.UserRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-05T13:23:50")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, String> brief;
    public static volatile CollectionAttribute<Roles, PermissionRole> permissionRoleCollection;
    public static volatile SingularAttribute<Roles, String> code;
    public static volatile SingularAttribute<Roles, Date> dateCreated;
    public static volatile SingularAttribute<Roles, User> updatedBy;
    public static volatile CollectionAttribute<Roles, UserRole> userRoleCollection;
    public static volatile SingularAttribute<Roles, User> createdBy;
    public static volatile SingularAttribute<Roles, String> name;
    public static volatile SingularAttribute<Roles, Integer> id;
    public static volatile SingularAttribute<Roles, String> status;
    public static volatile SingularAttribute<Roles, Date> dateUpdated;

}
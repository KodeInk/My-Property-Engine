package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Permissions;
import myproperty._entities.Person;
import myproperty._entities.Roles;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
@StaticMetamodel(RolePermission.class)
public class RolePermission_ { 

    public static volatile SingularAttribute<RolePermission, Permissions> permissionId;
    public static volatile SingularAttribute<RolePermission, Date> dateCreated;
    public static volatile SingularAttribute<RolePermission, Roles> roleId;
    public static volatile SingularAttribute<RolePermission, Integer> id;
    public static volatile SingularAttribute<RolePermission, Person> authorId;
    public static volatile SingularAttribute<RolePermission, String> status;

}
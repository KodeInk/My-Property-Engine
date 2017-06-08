package myproperty._entities;

import myproperty.v1._entities.UserRole;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Roles;
import myproperty.v1._entities.User;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile SingularAttribute<UserRole, Date> dateCreated;
    public static volatile SingularAttribute<UserRole, Roles> roleId;
    public static volatile SingularAttribute<UserRole, Integer> id;
    public static volatile SingularAttribute<UserRole, Integer> authorId;
    public static volatile SingularAttribute<UserRole, User> userId;
    public static volatile SingularAttribute<UserRole, String> status;

}
package myproperty.v1.db._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.Roles;
import myproperty.v1.db._entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-05T13:23:50")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile SingularAttribute<UserRole, Date> dateCreated;
    public static volatile SingularAttribute<UserRole, Roles> role;
    public static volatile SingularAttribute<UserRole, Integer> id;
    public static volatile SingularAttribute<UserRole, Integer> authorId;
    public static volatile SingularAttribute<UserRole, User> user;
    public static volatile SingularAttribute<UserRole, String> status;

}
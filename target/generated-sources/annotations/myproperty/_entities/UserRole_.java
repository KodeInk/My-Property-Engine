package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Person;
import myproperty._entities.Roles;
import myproperty._entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-11T18:54:53")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile SingularAttribute<UserRole, Date> dateCreated;
    public static volatile SingularAttribute<UserRole, Roles> roleId;
    public static volatile SingularAttribute<UserRole, Integer> id;
    public static volatile SingularAttribute<UserRole, Person> authorId;
    public static volatile SingularAttribute<UserRole, User> userId;
    public static volatile SingularAttribute<UserRole, String> status;

}
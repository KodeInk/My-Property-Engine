package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Person;
import myproperty._entities.UserRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-07T12:09:23")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Date> dateCreated;
    public static volatile SingularAttribute<Users, String> gender;
    public static volatile CollectionAttribute<Users, UserRole> userRoleCollection;
    public static volatile CollectionAttribute<Users, Person> personCollection;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile SingularAttribute<Users, Person> authorId;
    public static volatile SingularAttribute<Users, String> username;
    public static volatile SingularAttribute<Users, String> status;

}
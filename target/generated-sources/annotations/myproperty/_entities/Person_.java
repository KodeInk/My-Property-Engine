package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Roles;
import myproperty._entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T06:43:34")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, String> names;
    public static volatile SingularAttribute<Person, Date> dateCreated;
    public static volatile SingularAttribute<Person, String> gender;
    public static volatile SingularAttribute<Person, String> prefix;
    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile CollectionAttribute<Person, Roles> rolesCollection;
    public static volatile SingularAttribute<Person, User> userId;
    public static volatile SingularAttribute<Person, String> status;

}
package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Person;
import myproperty._entities.UserRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, String> role;
    public static volatile SingularAttribute<Roles, Date> dateCreated;
    public static volatile CollectionAttribute<Roles, UserRole> userRoleCollection;
    public static volatile SingularAttribute<Roles, Integer> id;
    public static volatile SingularAttribute<Roles, Person> authorId;
    public static volatile SingularAttribute<Roles, String> status;

}
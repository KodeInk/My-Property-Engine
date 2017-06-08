package myproperty.v1._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Address;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-08T16:17:03")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile CollectionAttribute<User, Address> addressCollection;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Date> dateCreated;
    public static volatile CollectionAttribute<User, Address> addressCollection1;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> username;
    public static volatile SingularAttribute<User, String> status;

}
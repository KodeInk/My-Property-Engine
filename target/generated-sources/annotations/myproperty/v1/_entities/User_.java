package myproperty.v1._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Accounts;
import myproperty.v1._entities.Address;
import myproperty.v1._entities.Contacts;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-28T22:46:03")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile CollectionAttribute<User, Address> addressCollection;
    public static volatile SingularAttribute<User, String> password;
    public static volatile CollectionAttribute<User, Contacts> contactsCollection;
    public static volatile SingularAttribute<User, Date> dateCreated;
    public static volatile CollectionAttribute<User, Accounts> accountsCollection;
    public static volatile CollectionAttribute<User, Contacts> contactsCollection1;
    public static volatile CollectionAttribute<User, Address> addressCollection1;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> username;
    public static volatile SingularAttribute<User, String> status;

}
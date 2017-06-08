package myproperty._entities;

import myproperty.v1._entities.Address;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Person;
import myproperty.v1._entities.User;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, User> updatedby;
    public static volatile SingularAttribute<Address, String> lng;
    public static volatile SingularAttribute<Address, Date> dateupdated;
    public static volatile SingularAttribute<Address, User> createdby;
    public static volatile CollectionAttribute<Address, Person> personCollection;
    public static volatile SingularAttribute<Address, String> location;
    public static volatile SingularAttribute<Address, Integer> id;
    public static volatile SingularAttribute<Address, Date> datecreated;
    public static volatile SingularAttribute<Address, String> lat;
    public static volatile SingularAttribute<Address, String> status;

}
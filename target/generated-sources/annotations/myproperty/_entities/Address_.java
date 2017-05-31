package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Person;
import myproperty._entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-31T12:57:02")
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
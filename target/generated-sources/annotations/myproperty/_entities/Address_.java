package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Person;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-06T16:48:37")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, Date> dateCreated;
    public static volatile SingularAttribute<Address, String> latitude;
    public static volatile SingularAttribute<Address, String> longtitude;
    public static volatile SingularAttribute<Address, String> location;
    public static volatile SingularAttribute<Address, Integer> id;
    public static volatile SingularAttribute<Address, Person> authorId;
    public static volatile SingularAttribute<Address, String> parentType;
    public static volatile SingularAttribute<Address, Integer> parentId;

}
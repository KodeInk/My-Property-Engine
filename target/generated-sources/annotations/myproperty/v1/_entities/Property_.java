package myproperty.v1._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Accounts;
import myproperty.v1._entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-28T22:46:03")
@StaticMetamodel(Property.class)
public class Property_ { 

    public static volatile SingularAttribute<Property, String> brief;
    public static volatile SingularAttribute<Property, Date> dateCreated;
    public static volatile SingularAttribute<Property, String> details;
    public static volatile SingularAttribute<Property, Integer> id;
    public static volatile SingularAttribute<Property, User> user;
    public static volatile SingularAttribute<Property, Accounts> account;
    public static volatile SingularAttribute<Property, Date> dateUpdated;
    public static volatile SingularAttribute<Property, String> status;

}
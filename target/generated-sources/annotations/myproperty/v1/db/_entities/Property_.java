package myproperty.v1.db._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.Accounts;
import myproperty.v1.db._entities.PropertySize;
import myproperty.v1.db._entities.PropertyTypes;
import myproperty.v1.db._entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-05T13:23:50")
@StaticMetamodel(Property.class)
public class Property_ { 

    public static volatile SingularAttribute<Property, String> brief;
    public static volatile CollectionAttribute<Property, PropertySize> propertySizeCollection;
    public static volatile SingularAttribute<Property, Date> dateCreated;
    public static volatile SingularAttribute<Property, String> details;
    public static volatile SingularAttribute<Property, Integer> id;
    public static volatile SingularAttribute<Property, PropertyTypes> type;
    public static volatile SingularAttribute<Property, User> user;
    public static volatile SingularAttribute<Property, Accounts> account;
    public static volatile SingularAttribute<Property, Date> dateUpdated;
    public static volatile SingularAttribute<Property, String> status;

}
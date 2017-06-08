package myproperty.v1._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Person;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-08T16:17:03")
@StaticMetamodel(Property.class)
public class Property_ { 

    public static volatile SingularAttribute<Property, Date> dateCreated;
    public static volatile SingularAttribute<Property, String> name;
    public static volatile SingularAttribute<Property, String> description;
    public static volatile SingularAttribute<Property, Integer> id;
    public static volatile SingularAttribute<Property, Person> authorId;
    public static volatile SingularAttribute<Property, String> status;

}
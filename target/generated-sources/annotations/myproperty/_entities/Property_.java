package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Person;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-26T06:24:36")
@StaticMetamodel(Property.class)
public class Property_ { 

    public static volatile SingularAttribute<Property, Date> dateCreated;
    public static volatile SingularAttribute<Property, String> name;
    public static volatile SingularAttribute<Property, String> description;
    public static volatile SingularAttribute<Property, Integer> id;
    public static volatile SingularAttribute<Property, Person> authorId;
    public static volatile SingularAttribute<Property, String> status;

}
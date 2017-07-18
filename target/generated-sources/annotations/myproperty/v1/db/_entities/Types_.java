package myproperty.v1.db._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.Categories;
import myproperty.v1.db._entities.Person;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-14T15:39:50")
@StaticMetamodel(Types.class)
public class Types_ { 

    public static volatile SingularAttribute<Types, String> description;
    public static volatile SingularAttribute<Types, Integer> id;
    public static volatile SingularAttribute<Types, String> type;
    public static volatile SingularAttribute<Types, Person> authorId;
    public static volatile SingularAttribute<Types, Date> dateAdded;
    public static volatile SingularAttribute<Types, Categories> categoryId;
    public static volatile SingularAttribute<Types, String> status;

}
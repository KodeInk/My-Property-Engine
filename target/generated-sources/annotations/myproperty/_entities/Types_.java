package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Categories;
import myproperty._entities.Person;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T20:03:58")
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
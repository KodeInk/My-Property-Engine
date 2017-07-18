package myproperty.v1.db._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.Person;
import myproperty.v1.db._entities.Types;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-14T15:39:50")
@StaticMetamodel(Categories.class)
public class Categories_ { 

    public static volatile SingularAttribute<Categories, Date> dateCreated;
    public static volatile SingularAttribute<Categories, String> description;
    public static volatile CollectionAttribute<Categories, Types> typesCollection;
    public static volatile SingularAttribute<Categories, Integer> id;
    public static volatile SingularAttribute<Categories, String> category;
    public static volatile SingularAttribute<Categories, Person> authorId;
    public static volatile SingularAttribute<Categories, String> status;

}
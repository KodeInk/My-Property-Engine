package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Person;
import myproperty._entities.Types;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T06:43:34")
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
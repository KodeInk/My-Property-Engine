package myproperty._entities;

import myproperty.v1._entities.Categories;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Person;
import myproperty.v1._entities.Types;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
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
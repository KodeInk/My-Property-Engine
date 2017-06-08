package myproperty._entities;

import myproperty.v1._entities.Rating;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
@StaticMetamodel(Rating.class)
public class Rating_ { 

    public static volatile SingularAttribute<Rating, Date> dateCreated;
    public static volatile SingularAttribute<Rating, Integer> rate;
    public static volatile SingularAttribute<Rating, Integer> id;
    public static volatile SingularAttribute<Rating, Integer> parentId;
    public static volatile SingularAttribute<Rating, String> parentType;

}
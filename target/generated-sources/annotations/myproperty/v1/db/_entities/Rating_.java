package myproperty.v1.db._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-14T15:39:50")
@StaticMetamodel(Rating.class)
public class Rating_ { 

    public static volatile SingularAttribute<Rating, Date> dateCreated;
    public static volatile SingularAttribute<Rating, Integer> rate;
    public static volatile SingularAttribute<Rating, Integer> id;
    public static volatile SingularAttribute<Rating, Integer> parentId;
    public static volatile SingularAttribute<Rating, String> parentType;

}
package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-30T11:34:59")
@StaticMetamodel(Reviews.class)
public class Reviews_ { 

    public static volatile SingularAttribute<Reviews, Date> dateCreated;
    public static volatile SingularAttribute<Reviews, String> comment;
    public static volatile SingularAttribute<Reviews, Integer> id;
    public static volatile SingularAttribute<Reviews, String> parenttype;
    public static volatile SingularAttribute<Reviews, Integer> parentid;

}
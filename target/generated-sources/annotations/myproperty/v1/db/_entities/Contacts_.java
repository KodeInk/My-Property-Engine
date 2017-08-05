package myproperty.v1.db._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-05T15:14:20")
@StaticMetamodel(Contacts.class)
public class Contacts_ { 

    public static volatile SingularAttribute<Contacts, Date> dateCreated;
    public static volatile SingularAttribute<Contacts, User> updatedBy;
    public static volatile SingularAttribute<Contacts, User> createdBy;
    public static volatile SingularAttribute<Contacts, String> details;
    public static volatile SingularAttribute<Contacts, Integer> id;
    public static volatile SingularAttribute<Contacts, String> type;
    public static volatile SingularAttribute<Contacts, String> parentType;
    public static volatile SingularAttribute<Contacts, Integer> parentId;
    public static volatile SingularAttribute<Contacts, Date> dateUpdated;
    public static volatile SingularAttribute<Contacts, String> status;

}
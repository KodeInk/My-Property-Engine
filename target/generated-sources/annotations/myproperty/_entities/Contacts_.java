package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Person;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
@StaticMetamodel(Contacts.class)
public class Contacts_ { 

    public static volatile SingularAttribute<Contacts, Date> dateCreated;
    public static volatile SingularAttribute<Contacts, Integer> updatedBy;
    public static volatile SingularAttribute<Contacts, Integer> createdBy;
    public static volatile CollectionAttribute<Contacts, Person> personCollection;
    public static volatile SingularAttribute<Contacts, String> details;
    public static volatile SingularAttribute<Contacts, Integer> id;
    public static volatile SingularAttribute<Contacts, String> type;
    public static volatile SingularAttribute<Contacts, Date> dateUpdated;
    public static volatile SingularAttribute<Contacts, String> status;

}
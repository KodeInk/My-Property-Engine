package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Account;
import myproperty._entities.Person;
import myproperty._entities.SubscriptionPermission;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
@StaticMetamodel(Subscription.class)
public class Subscription_ { 

    public static volatile CollectionAttribute<Subscription, Account> accountCollection;
    public static volatile SingularAttribute<Subscription, String> name;
    public static volatile CollectionAttribute<Subscription, SubscriptionPermission> subscriptionPermissionCollection;
    public static volatile SingularAttribute<Subscription, Integer> id;
    public static volatile SingularAttribute<Subscription, Person> authorId;
    public static volatile SingularAttribute<Subscription, Date> dateAdded;

}
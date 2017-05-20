package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Account;
import myproperty._entities.Person;
import myproperty._entities.SubscriptionPermission;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T20:03:58")
@StaticMetamodel(Subscription.class)
public class Subscription_ { 

    public static volatile CollectionAttribute<Subscription, Account> accountCollection;
    public static volatile SingularAttribute<Subscription, String> name;
    public static volatile CollectionAttribute<Subscription, SubscriptionPermission> subscriptionPermissionCollection;
    public static volatile SingularAttribute<Subscription, Integer> id;
    public static volatile SingularAttribute<Subscription, Person> authorId;
    public static volatile SingularAttribute<Subscription, Date> dateAdded;

}
package myproperty.v1._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Account;
import myproperty.v1._entities.Person;
import myproperty.v1._entities.SubscriptionPermission;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-08T16:17:03")
@StaticMetamodel(Subscription.class)
public class Subscription_ { 

    public static volatile CollectionAttribute<Subscription, Account> accountCollection;
    public static volatile SingularAttribute<Subscription, String> name;
    public static volatile CollectionAttribute<Subscription, SubscriptionPermission> subscriptionPermissionCollection;
    public static volatile SingularAttribute<Subscription, Integer> id;
    public static volatile SingularAttribute<Subscription, Person> authorId;
    public static volatile SingularAttribute<Subscription, Date> dateAdded;

}
package myproperty._entities;

import myproperty.v1._entities.SubscriptionPermission;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Permissions;
import myproperty.v1._entities.Person;
import myproperty.v1._entities.Subscription;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
@StaticMetamodel(SubscriptionPermission.class)
public class SubscriptionPermission_ { 

    public static volatile SingularAttribute<SubscriptionPermission, Permissions> permissionId;
    public static volatile SingularAttribute<SubscriptionPermission, Date> dateCreated;
    public static volatile SingularAttribute<SubscriptionPermission, Integer> id;
    public static volatile SingularAttribute<SubscriptionPermission, Person> authorId;
    public static volatile SingularAttribute<SubscriptionPermission, Subscription> subscriptionId;
    public static volatile SingularAttribute<SubscriptionPermission, String> status;

}
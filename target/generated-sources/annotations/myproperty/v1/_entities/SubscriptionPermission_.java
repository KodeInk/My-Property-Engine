package myproperty.v1._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Permissions;
import myproperty.v1._entities.Person;
import myproperty.v1._entities.Subscription;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-08T16:17:03")
@StaticMetamodel(SubscriptionPermission.class)
public class SubscriptionPermission_ { 

    public static volatile SingularAttribute<SubscriptionPermission, Permissions> permissionId;
    public static volatile SingularAttribute<SubscriptionPermission, Date> dateCreated;
    public static volatile SingularAttribute<SubscriptionPermission, Integer> id;
    public static volatile SingularAttribute<SubscriptionPermission, Person> authorId;
    public static volatile SingularAttribute<SubscriptionPermission, Subscription> subscriptionId;
    public static volatile SingularAttribute<SubscriptionPermission, String> status;

}
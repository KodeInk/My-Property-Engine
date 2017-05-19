package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Permissions;
import myproperty._entities.Person;
import myproperty._entities.Subscription;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-18T22:07:56")
@StaticMetamodel(SubscriptionPermission.class)
public class SubscriptionPermission_ { 

    public static volatile SingularAttribute<SubscriptionPermission, Permissions> permissionId;
    public static volatile SingularAttribute<SubscriptionPermission, Date> dateCreated;
    public static volatile SingularAttribute<SubscriptionPermission, Integer> id;
    public static volatile SingularAttribute<SubscriptionPermission, Person> authorId;
    public static volatile SingularAttribute<SubscriptionPermission, Subscription> subscriptionId;
    public static volatile SingularAttribute<SubscriptionPermission, String> status;

}
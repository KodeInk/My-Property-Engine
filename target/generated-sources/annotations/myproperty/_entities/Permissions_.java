package myproperty._entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.RolePermission;
import myproperty._entities.SubscriptionPermission;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-22T10:02:14")
@StaticMetamodel(Permissions.class)
public class Permissions_ { 

    public static volatile CollectionAttribute<Permissions, RolePermission> rolePermissionCollection;
    public static volatile SingularAttribute<Permissions, String> code;
    public static volatile SingularAttribute<Permissions, String> displayName;
    public static volatile SingularAttribute<Permissions, String> permissionscol;
    public static volatile CollectionAttribute<Permissions, SubscriptionPermission> subscriptionPermissionCollection;
    public static volatile SingularAttribute<Permissions, Integer> id;
    public static volatile SingularAttribute<Permissions, String> grouping;
    public static volatile SingularAttribute<Permissions, String> status;

}
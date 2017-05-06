package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Account;
import myproperty._entities.AccountType;
import myproperty._entities.Address;
import myproperty._entities.Categories;
import myproperty._entities.Property;
import myproperty._entities.RolePermission;
import myproperty._entities.Roles;
import myproperty._entities.Subscription;
import myproperty._entities.SubscriptionPermission;
import myproperty._entities.Types;
import myproperty._entities.User;
import myproperty._entities.UserRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-22T10:02:14")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile CollectionAttribute<Person, RolePermission> rolePermissionCollection;
    public static volatile CollectionAttribute<Person, Address> addressCollection;
    public static volatile CollectionAttribute<Person, Account> accountCollection;
    public static volatile SingularAttribute<Person, String> gender;
    public static volatile SingularAttribute<Person, String> prefix;
    public static volatile CollectionAttribute<Person, User> userCollection;
    public static volatile CollectionAttribute<Person, Categories> categoriesCollection;
    public static volatile SingularAttribute<Person, User> userId;
    public static volatile CollectionAttribute<Person, Subscription> subscriptionCollection;
    public static volatile SingularAttribute<Person, String> names;
    public static volatile SingularAttribute<Person, Date> dateCreated;
    public static volatile CollectionAttribute<Person, UserRole> userRoleCollection;
    public static volatile CollectionAttribute<Person, Types> typesCollection;
    public static volatile CollectionAttribute<Person, SubscriptionPermission> subscriptionPermissionCollection;
    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile CollectionAttribute<Person, Roles> rolesCollection;
    public static volatile CollectionAttribute<Person, Property> propertyCollection;
    public static volatile SingularAttribute<Person, String> status;
    public static volatile CollectionAttribute<Person, AccountType> accountTypeCollection;

}
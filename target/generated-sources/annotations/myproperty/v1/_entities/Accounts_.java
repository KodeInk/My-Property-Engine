package myproperty.v1._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.AccountTypes;
import myproperty.v1._entities.Packages;
import myproperty.v1._entities.Property;
import myproperty.v1._entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-28T22:46:03")
@StaticMetamodel(Accounts.class)
public class Accounts_ { 

    public static volatile SingularAttribute<Accounts, Date> dateCreated;
    public static volatile SingularAttribute<Accounts, Integer> updatedBy;
    public static volatile SingularAttribute<Accounts, AccountTypes> accountTypeId;
    public static volatile SingularAttribute<Accounts, Integer> createdBy;
    public static volatile SingularAttribute<Accounts, Packages> packageId;
    public static volatile SingularAttribute<Accounts, Integer> id;
    public static volatile SingularAttribute<Accounts, User> account_owner;
    public static volatile CollectionAttribute<Accounts, Property> propertyCollection;
    public static volatile SingularAttribute<Accounts, Integer> parentId;
    public static volatile SingularAttribute<Accounts, String> status;
    public static volatile SingularAttribute<Accounts, Date> dateUpdated;

}
package myproperty.v1.db._entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.Accounts;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-27T15:31:39")
@StaticMetamodel(AccountTypes.class)
public class AccountTypes_ { 

    public static volatile CollectionAttribute<AccountTypes, Accounts> accountsCollection;
    public static volatile SingularAttribute<AccountTypes, String> accountType;
    public static volatile SingularAttribute<AccountTypes, Integer> id;

}
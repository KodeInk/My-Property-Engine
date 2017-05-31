package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Account;
import myproperty._entities.Person;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-31T12:57:02")
@StaticMetamodel(AccountType.class)
public class AccountType_ { 

    public static volatile CollectionAttribute<AccountType, Account> accountCollection;
    public static volatile SingularAttribute<AccountType, Date> dateCreated;
    public static volatile SingularAttribute<AccountType, Integer> id;
    public static volatile SingularAttribute<AccountType, String> type;
    public static volatile SingularAttribute<AccountType, Person> authorId;

}
package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.AccountType;
import myproperty._entities.Person;
import myproperty._entities.Subscription;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Date> dateCreated;
    public static volatile SingularAttribute<Account, String> accountName;
    public static volatile SingularAttribute<Account, AccountType> accountType;
    public static volatile SingularAttribute<Account, Integer> id;
    public static volatile SingularAttribute<Account, Subscription> subscription;
    public static volatile SingularAttribute<Account, Person> authorId;

}
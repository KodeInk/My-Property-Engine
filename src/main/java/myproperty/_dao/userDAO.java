package myproperty._dao;

import java.util.Collection;
import java.util.Map;
import myproperty._entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Mover on 4/9/2017.
 */

@Repository
public class userDAO {

    @Autowired
    public static Map<Integer,User> users;

    //TODO: list Users
    public Collection<User> getAllUsers(){
        return this.users.values();
    }


    // TODO: create User

    // TODO: update User

}

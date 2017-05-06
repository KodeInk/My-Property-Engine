package myproperty._dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import myproperty._entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by Mover on 4/9/2017.
 */

@Repository
@Qualifier("userImpl")
public class userDAOImpl implements userDAO {

    @Autowired
    public static Map<Long,User> users;

    //fake data
//  static {
//      users = new HashMap<Integer,User>(){
//          {
//              put(((1,new User(1,"move","miles"));
//              put(2,new User(2,"Senior","two"));
//              put(3,new User(3,"Serious","Maker"));
//          }
//      };
//    };

    //TODO: list Users
    @Override
    public Collection<User> getAllUsers(){
        return this.users.values();
    }

    //TODO: get User By Id
    @Override
    public User getUserById(int id){
        return this.users.get(id);
    }

    //TODO: Delete user By Id
    @Override
    public void deleteUserById(int id){
         this.users.remove(id);
    }


    // TODO: Update User

    @Override
    public User updateUserById(User user){
        User s = this.users.get(user.getId());
        s.setPassword(user.getPassword());
        s.setUsername(user.getUsername());

        this.users.put(user.getId(),user);

        return user;

    }

    // TODO: Create User
    @Override
    public void createUser(User user){
        this.users.put(user.getId(),user);
    }

}

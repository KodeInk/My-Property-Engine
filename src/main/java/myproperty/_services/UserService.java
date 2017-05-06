package myproperty._services;
import myproperty._dao.userDAOImpl;
import myproperty._entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;


/**
 * Created by Mover  on 4/11/2017.
 */

@Service
public class UserService {

    @Autowired
    @Qualifier("userImpl")
    private userDAOImpl userDAOImpl;

    //TODO: Fetch all  Users
    public Collection<User> getAllUsers(){
        return userDAOImpl.getAllUsers();
    }

    //TODO : get User By Id
    public User getUserById(int id){
        return userDAOImpl.getUserById(id);
    }

    //TODO: Delete User By Id
    public void deleteUserById(int id){
         userDAOImpl.deleteUserById(id);
    }
    //TODO: update User By Id
    public User updateUser(User user){
       return userDAOImpl.updateUserById(user);
    }
    //TODO: Create User
    public void createUser(User user){
        userDAOImpl.createUser(user);
    }


}

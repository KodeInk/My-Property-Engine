package myproperty._services;

import myproperty._dao.userDAOImpl;
import myproperty._entities.User;
import org.springframework.stereotype.Service;

import java.util.Collection;


/**
 * Created by Mover  on 4/11/2017.
 */

@Service
public class UserService {


    private  userDAOImpl userDAOImpl = new userDAOImpl();

    //TODO: Fetch all  Users
    public Collection<User> getAllUsers(){
        return userDAOImpl.findUserEntities();
    }

    //TODO : get User By Id
    public User getUserById(Integer id){
        return userDAOImpl.findUser(id);
    }

    //TODO: Delete User By Id
    public void deleteUserById(Integer id) throws Exception{
         userDAOImpl.destroy(id);
    }
    //TODO: update User By Id
    public User updateUser(User user) throws  Exception{
       return userDAOImpl.edit(user);
    }
    //TODO: Create User
    public User createUser(User user){
      return   userDAOImpl.create(user);
    }


}

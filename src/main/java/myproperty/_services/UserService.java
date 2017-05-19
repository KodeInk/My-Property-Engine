package myproperty._services;

import myproperty._dao.userDAOImpl;
import myproperty._entities.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;
import static myproperty.helper.utilities.*;


/**
 * Created by Mover  on 4/11/2017.
 */

@Service
public class UserService {


    private  userDAOImpl userDAOImpl = myproperty._dao.userDAOImpl.getInstance();



    //TODO: Fetch all  Users
    public Collection<User> getAllUsers() {
        return userDAOImpl.findUserEntities();
    }

    //TODO : get User By Id
    public User getUserById(Integer id) {
        return userDAOImpl.findUser(id);
    }

    //TODO: Delete User By Id
    public void deleteUserById(Integer id) throws Exception{
         userDAOImpl.destroy(id);
    }
    //TODO: update User By Id
    public User updateUser(User user) throws Exception {
       return userDAOImpl.edit(user);
    }
    //TODO: Create User
    public User createUser(User user) {

        String password = user.getPassword();
        String username = user.getUsername();

        // Throw Exception when  the User does not meet the mini um requirements
        if(password.length() <= 3  || username.length() <= 1 ){
            throw new IllegalArgumentException();
        }
        // convert password to protecteed version
        password = encryptPassword_md5("oipii");
        user.setPassword(password);
        user.setStatus("PENDING");
        user.setDateCreated(getCurrentDate());

        return userDAOImpl.create(user);

    }


}

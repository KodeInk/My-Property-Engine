package myproperty._services;

import myproperty._dao.userDAOImpl;
import myproperty._entities.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import myproperty._entities.UserResponse;
import myproperty.helper.exception.BadRequestException;
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
    public UserResponse getUserById(Integer id) {
        UserResponse userResponse = UserResponse(userDAOImpl.findUser(id));
        return userResponse;
    }

    //TODO: Delete User By Id
    public void deleteUserById(Integer id) throws Exception{
         userDAOImpl.destroy(id);
    }
    //TODO: update User By Id
    public UserResponse updateUser(User user) throws Exception {
        String password;

        // convert password to protecteed version
        if (!user.getPassword().isEmpty()) {
            if (user.getPassword().length() <= 3) {
                throw new BadRequestException("The Password is too short ");
            }
            password = encryptPassword_md5(user.getPassword());
            user.setPassword(password);
        }

        if (user.getStatus() == null) {
            user.setStatus("PENDING");
        }

        user.setDateCreated(getCurrentDate());
        return UserResponse(userDAOImpl.edit(user));

    }
    //TODO: Create User
    public UserResponse createUser(User user) {

        String password;


        // Throw Exception when  the User does not meet the mini um requirements
        if (user.getPassword().length() <= 3 || user.getUsername().length() <= 1) {
            throw new IllegalArgumentException();
        }
        // convert password to protecteed version
        password = encryptPassword_md5(user.getPassword());
        user.setPassword(password);

        if (user.getStatus() == null)
            user.setStatus("PENDING");

        user.setDateCreated(getCurrentDate());

        return UserResponse(userDAOImpl.create(user));

    }

    public UserResponse UserResponse(User user1) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user1.getId());
        userResponse.setDateCreated(user1.getDateCreated());
        userResponse.setUsername(user1.getUsername());
        return userResponse;
    }


}

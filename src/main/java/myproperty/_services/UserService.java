package myproperty._services;

import java.util.AbstractCollection;
import java.util.ArrayList;
import myproperty._dao.userDAOImpl;
import myproperty._entities.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty._entities.responses.UserResponse;
import myproperty.helper.exception.BadRequestException;
import static myproperty.helper.utilities.*;


/**
 * Created by Mover  on 4/11/2017.
 */

@Service
public class UserService {

    private final userDAOImpl userDAOImpl = myproperty._dao.userDAOImpl.getInstance();
    private static final Logger LOG = Logger.getLogger(UserService.class.getName());


    //TODO: Fetch all  Users
    public Collection<UserResponse> getAllUsers() {

        Collection<User> users = userDAOImpl.findUserEntities();
        Collection<UserResponse> userResponses = new ArrayList<>();

        /*for (User user : users) {
            userResponses.add(UserResponse(user));
        } */
        //Functional Alternative
        users.forEach((User user) -> {
            userResponses.add(UserResponse(user));
        });

        return userResponses;
    }

    //TODO : get User By Id
    public UserResponse getUserById(Integer id) {

        return UserResponse(userDAOImpl.findUser(id));
    }

    //TODO: Delete User By Id
    public void deleteUserById(Integer id) throws Exception{
         userDAOImpl.destroy(id);
    }
    //TODO: update User By Id
    public UserResponse updateUser(Integer user_id, User user) throws Exception {

        // Set User Id
        user.setId(user_id);


        // Password 
        String password;
        LOG.log(Level.INFO, "Hit UpdateUser Method in User Service ");
        // convert password to protecteed version
        if (!user.getPassword().isEmpty()) {
            if (user.getPassword().length() <= 3) {
                LOG.log(Level.INFO, "The Password is too short ");
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

    public UserResponse UserResponse(User _user) {
        UserResponse userResponse = new UserResponse();
        if (_user == null) {
            return userResponse;
        }

        userResponse.setId(_user.getId());
        userResponse.setDateCreated(_user.getDateCreated());
        userResponse.setUsername(_user.getUsername());
        return userResponse;
    }


}

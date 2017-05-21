package myproperty._services;

import java.util.AbstractCollection;
import java.util.ArrayList;
import myproperty._dao.userDAOImpl;
import myproperty._entities.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty._entities.UserResponse;
import myproperty.helper.StatusEnum;
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
    public UserResponse updateUser(String user_Id, User user) throws Exception {


        if (user_Id.isEmpty()) {
            throw new BadRequestException("User ID is Empty ");
        }

        Integer userId = Integer.parseInt(user_Id);

        UserResponse _userDetails = getUserById(userId);

        user.setId(userId);
        // convert password to protecteed version
        if (!user.getPassword().isEmpty()) {
            if (user.getPassword().length() <= 3) {
                LOG.log(Level.INFO, "The Password is too short ");
                throw new BadRequestException("The Password is too short ");
            }

            LOG.log(Level.INFO, " Password is  {0}", user.getPassword());
            user.setPassword(encryptPassword_md5(user.getPassword()));
        }

        if (user.getStatus() == null) {
            user.setStatus(_userDetails.getStatus());
        }
        user.setDateCreated(_userDetails.getDateCreated());

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
            user.setStatus(StatusEnum.PENDING.toString());

        user.setDateCreated(getCurrentDate());

        return UserResponse(userDAOImpl.create(user));

    }

    //TODO: Activate User 
    public UserResponse activateUser(String user_Id) throws Exception {
        if (user_Id.isEmpty()) {
            throw new BadRequestException("User ID is Empty ");
        }

        Integer userId = Integer.parseInt(user_Id);
        User user = userDAOImpl.findUser(userId);
        user.setId(userId);
        user.setStatus(StatusEnum.ACTIVE.toString());
        return UserResponse(userDAOImpl.edit(user));
    }

    //TODO: Activate User
    public UserResponse deactivateUser(String user_Id) throws Exception {
        if (user_Id.isEmpty()) {
            throw new BadRequestException("User ID is Empty ");
        }

        Integer userId = Integer.parseInt(user_Id);
        User user = userDAOImpl.findUser(userId);
        user.setId(userId);
        user.setStatus(StatusEnum.DEACTIVATED.toString());
        return UserResponse(userDAOImpl.edit(user));
    }


    //TODO: User Response 
    public UserResponse UserResponse(User user1) {
        UserResponse response = new UserResponse();
        response.setId(user1.getId());
        response.setDateCreated(user1.getDateCreated());
        response.setUsername(user1.getUsername());
        response.setStatus(user1.getStatus());
        return response;

    }


}

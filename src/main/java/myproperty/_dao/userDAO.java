package myproperty._dao;

import myproperty._entities.User;

import java.util.Collection;

/**
 * Created by Manny on 4/16/2017.
 */
public interface userDAO {
    //TODO: list Users
    Collection<User> getAllUsers();

    //TODO: get User By Id
    User getUserById(int id);

    //TODO: Delete user By Id
    void deleteUserById(int id);

    User updateUserById(User user);

    // TODO: Create User
    void createUser(User user);
}

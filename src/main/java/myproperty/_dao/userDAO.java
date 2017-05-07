package myproperty._dao;

import myproperty._entities.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Manny on 5/6/2017.
 */

public interface userDAO extends Serializable {
    User  create(User user);

    User edit(User user) throws Exception;

    User findUser(Integer id);

    List<User> findUserEntities();

    List<User> findUserEntities(int maxResults, int firstResult);

    void destroy(Integer id) throws Exception;

    User CheckPassword(User user);
}

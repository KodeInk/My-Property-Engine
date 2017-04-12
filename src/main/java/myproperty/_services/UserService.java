package myproperty._services;
import myproperty._dao.userDAO;
import myproperty._entities.User;
import org.springframework.stereotype.Service;

import java.util.Collection;


/**
 * Created by Mover  on 4/11/2017.
 */

@Service
public class UserService {
    private userDAO userDAO;

    //TODO: Fetch all  Users
    public Collection<User> getAllUsers(){
        return userDAO.getAllUsers();
    }

}

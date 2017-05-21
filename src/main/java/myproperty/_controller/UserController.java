package myproperty._controller;


import myproperty._entities.User;
import myproperty._services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty._entities.UserResponse;

import myproperty.helper.exception.BadRequestException;

/**
 * Created by Mover on 4/11/2017.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    private static final Logger LOG = Logger.getLogger(UserController.class.getName());

    @RequestMapping(value = "/list", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<UserResponse> getUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    //Delete has issues:
    @RequestMapping(value = "/{id}/delete",method = RequestMethod.DELETE)
    public Boolean deleteUserById( @PathVariable("id") int id ) throws  Exception{
         userService.deleteUserById(id);
         return true;
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse updateUser(@RequestBody User user, @PathVariable String id) throws Exception {
        LOG.log(Level.INFO, "Hit the User Update Endpoint");

        return userService.updateUser(id, user);
    }

    //TODO: Activate User 
    @RequestMapping(value = "/{id}/activate", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void activateUser(@RequestBody User user) throws Exception {

    }

    //TODO: Deactivate User
    @RequestMapping(value = "/{id}/deactivate", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deactivateUser(@RequestBody User user) throws Exception {

    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse createUser(@RequestBody User user) {
        try {
            return userService.createUser(user);
        } catch (Exception em) {
            throw new BadRequestException("User was not saved correctly  ");
        }
    }





    /*
        Everything will be based on permission some one has on the system:
     */


}

package myproperty._controller;


import myproperty._entities.User;
import myproperty._services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import myproperty.helper.exception.BadRequestException;

/**
 * Created by Mover on 4/11/2017.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}/delete",method = RequestMethod.DELETE)
    public Boolean deleteUserById( @PathVariable("id") int id ) throws  Exception{
         userService.deleteUserById(id);
         return true;
    }

    @RequestMapping(value="/{id}/update",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody User user) throws Exception {
        userService.updateUser(user);
    }

    //TODO: Active User
    @RequestMapping(value = "/{id}/activate", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void activateUser(@RequestBody User user) throws Exception {
        // userService.updateUser(user);
    }

    //TODO: Deactive User
    @RequestMapping(value = "/{id}/deactivate", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deactivateUser(@RequestBody User user) throws Exception {
        //userService.updateUser(user);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public User createUser(@RequestBody User user) {
        // String logId = context.getProperty("logId").toString();

        try {
            return userService.createUser(user);
        } catch (Exception em) {
            throw new BadRequestException("User Did Not Save Succesully ");
        }


    }








}

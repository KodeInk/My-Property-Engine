package myproperty._controller;


import myproperty._entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import myproperty._services.UserService;
import org.springframework.http.MediaType;

import java.util.Collection;

/**
 * Created by Mover on 4/11/2017.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Collection<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUserById( @PathVariable("id") int id ){
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Boolean deleteUserById( @PathVariable("id") int id ) throws  Exception{
         userService.deleteUserById(id);
         return true;
    }

    @RequestMapping(value="/update",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody User user) throws Exception {

        userService.updateUser(user);

    }


    @RequestMapping(value="/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody User user) {

        try {
            userService.createUser(user);
        }
        catch (Exception em){
            em.getMessage();
        }

    }








}

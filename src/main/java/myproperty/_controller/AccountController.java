package myproperty._controller;

import myproperty._entities.User;
import org.springframework.web.bind.annotation.*;


/**
 * Created by MOVER on 2/27/2017.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @RequestMapping(method = RequestMethod.GET)
    public String getAccounts(){
        return "Helo Accounts Mappers ";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public @ResponseBody String create_new_account(@RequestBody User user){
        return " Create New Account ";
    }
}

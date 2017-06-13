package myproperty.v1._controller;

import myproperty.v1._entities.User;
import org.springframework.http.MediaType;
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

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String create_new_account(@RequestBody User user) {
        return " Create New Account ";
    }
}

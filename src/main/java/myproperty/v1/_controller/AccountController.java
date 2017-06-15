package myproperty.v1._controller;

import myproperty.v1._entities.Account;
import myproperty.v1._services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 * Created by MOVER on 2/27/2017.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAccounts(){
        return "Helo Accounts Mappers ";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Boolean create_new_account(@RequestBody Account account) throws Exception {
        return accountService.createAccount(account);
    }
}

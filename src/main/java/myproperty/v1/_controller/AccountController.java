package myproperty.v1._controller;

import java.util.Collection;
import myproperty.v1.db._entities.Account;
import myproperty.v1.db._entities.Accounts;
import myproperty.v1.db._entities.responses.AccountsResponse;
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

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<AccountsResponse> getAccounts() throws Exception {
        return accountService.getAccounts();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountsResponse get_account_details(@PathVariable Integer id) throws Exception {
        return accountService.getAccountDetails(id);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountsResponse create_new_account(@RequestBody Account account) throws Exception {
        return accountService.createAccount(account);
    }

    @RequestMapping(value = "/{id}/activate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountsResponse activate_account(@PathVariable Integer id) throws Exception {
        return accountService.activateAccount(id);
    }

    @RequestMapping(value = "/{id}/deactivate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountsResponse deactivate_account(@PathVariable Integer id) throws Exception {
        return accountService.deactivateAccount(id);
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountsResponse update_account(@PathVariable Integer id, @RequestBody Accounts account) throws Exception {
        return accountService.updateAccount(id, account);
    }



}

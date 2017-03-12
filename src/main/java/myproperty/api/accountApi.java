package myproperty.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MOVER on 2/27/2017.
 */
@RestController
public class accountApi {

    @RequestMapping("/")
    public String index(){
        return "Helo Movers and SHakers ";
    }
}

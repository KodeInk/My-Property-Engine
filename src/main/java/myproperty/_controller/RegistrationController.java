/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @autho Mover
 * @date MAR_14_2017
 */
@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public void new_registration() {
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void update_registration() {
    }

    @RequestMapping(value = "/deactivate", method = RequestMethod.POST)
    public void deactivate_registration() {
    }
    //TODO : Activate Registration
    //TODO : 

}

// TODO : Missing Improvement in the FUnctionality ::

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.helper.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author mover
 */
@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE)
public class ServiceUnAvailableException extends RuntimeException {
    public static final Message MESSAGE=new Message("service unavailable");

    public ServiceUnAvailableException() {
        super(MESSAGE.getMessage());

    }
    
}

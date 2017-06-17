/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.helper.exception;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author mover
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class ForbiddenException extends RuntimeException {
    private static final Logger LOG = Logger.getLogger(ForbiddenException.class.getName());

    public ForbiddenException()
    {
        super("FORBIDDEN");
    }
    
    public ForbiddenException(String message)
    {
        this(message, message);
    }
    
    public ForbiddenException(String message, String logMessage) {
        super(message);
        LOG.log(Level.WARNING, logMessage, "FORBIDDEN");
    }
    
    
}

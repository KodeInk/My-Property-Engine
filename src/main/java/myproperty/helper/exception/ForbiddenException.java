/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.helper.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mover
 */
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

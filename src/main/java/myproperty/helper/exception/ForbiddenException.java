/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.helper.exception;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Muyinza
 */
public class ForbiddenException extends WebApplicationException
{
    private static final Logger LOG = Logger.getLogger(ForbiddenException.class.getName());

    public ForbiddenException()
    {
        super(Response.Status.FORBIDDEN);
    }
    
    public ForbiddenException(String message)
    {
        this(message, message);
    }
    
    public ForbiddenException(String message, String logMessage) {
        super(
                Response
                .status(Response.Status.FORBIDDEN)
                .entity(new Message(message))
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build()
        );
        LOG.log(Level.WARNING, logMessage, Response.Status.NOT_FOUND);
    }
    
    
}

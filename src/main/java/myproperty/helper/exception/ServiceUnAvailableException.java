/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.helper.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Stephen Kazibwe Sr
 */
public class ServiceUnAvailableException extends WebApplicationException{
    public static final Message MESSAGE=new Message("service unavailable");
    private static final Response.ResponseBuilder RESPONSE_BUILDER= 
            Response.status(Response.Status.SERVICE_UNAVAILABLE)
                    .type(MediaType.APPLICATION_JSON);
    public ServiceUnAvailableException(){
        super(RESPONSE_BUILDER.entity(MESSAGE).build());
    }
    
}

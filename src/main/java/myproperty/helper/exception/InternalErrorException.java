package myproperty.helper.exception;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import myproperty.helper.utilities;

/**
 *
 * @author mover
 */
public class InternalErrorException extends WebApplicationException {

    private static final Logger LOG = Logger.getLogger(InternalErrorException.class.getName());

    public InternalErrorException() {
        super(Response.Status.INTERNAL_SERVER_ERROR);
    }

    public InternalErrorException(String message) {
        this(message, null);
    }
    
    public InternalErrorException(String message, Throwable ex) {
        super(
                Response
                .status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(new Message(message))
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build()
        );
        LOG.log(Level.SEVERE, message, Response.Status.INTERNAL_SERVER_ERROR);
        
        if (ex != null) {
            LOG.log(Level.SEVERE, utilities.getStackTrace(ex));
        }
    }

}

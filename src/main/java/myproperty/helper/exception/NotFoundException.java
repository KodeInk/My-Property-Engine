package myproperty.helper.exception;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Isbel
 */
public class NotFoundException extends WebApplicationException {

    private static final Logger LOG = Logger.getLogger(NotFoundException.class.getName());

    public NotFoundException() {
        super(Response.Status.NOT_FOUND);
    }

    public NotFoundException(String message) {
        this(message, message);
    }

    public NotFoundException(String message, String logMessage) {
        super(
                Response
                .status(Response.Status.NOT_FOUND)
                .entity(new Message(message))
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build()
        );
        LOG.log(Level.WARNING, logMessage, Response.Status.NOT_FOUND);
    }

}

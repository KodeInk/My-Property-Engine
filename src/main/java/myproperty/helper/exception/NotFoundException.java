package myproperty.helper.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mover
 */
public class NotFoundException extends RuntimeException {

    private static final Logger LOG = Logger.getLogger(NotFoundException.class.getName());

    public NotFoundException() {
        super(" STATUS NOT FOUND ");
    }

    public NotFoundException(String message) {
        this(message, message);
    }

    public NotFoundException(String message, String logMessage) {
        super(message);
        LOG.log(Level.WARNING, logMessage, "STATUS NOT FOUND ");
    }

}

package myproperty.v1.helper.exception;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author mover
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
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

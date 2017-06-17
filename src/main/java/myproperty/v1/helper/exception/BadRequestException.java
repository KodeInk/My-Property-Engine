package myproperty.v1.helper.exception;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author mover
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    private static final Logger LOG = Logger.getLogger(BadRequestException.class.getName());

    public BadRequestException() {
        super("BAD REQUEST");
    }

    public BadRequestException(String message) {
        this(message, message);
    }

    public BadRequestException(String message, String logMessage) {
        super(message);
        LOG.log(Level.WARNING, logMessage, "BAD  REQUEST ");
    }

}

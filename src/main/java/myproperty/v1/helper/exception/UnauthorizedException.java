package myproperty.v1.helper.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author mover
 */
@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RuntimeException {
    
    public static final Message MESSAGE = new Message("invalid security credentials");

    public UnauthorizedException() {
        super(MESSAGE.getMessage());
    }
    
}

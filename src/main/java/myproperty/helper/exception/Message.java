package myproperty.helper.exception;

import java.util.Objects;

/**
 *
 * @author mover
 */
public class Message {

    private String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.message);
        return hash;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName()+ 
                "[" +
                "message=" + message +
                "]";
    }
    
}

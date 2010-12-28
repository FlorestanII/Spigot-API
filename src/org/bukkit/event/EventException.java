package org.bukkit.event;

public class EventException extends Exception {
    private final Throwable cause;

    /**
     * Constructs a new EventException based on the given Exception
     *
     * @param throwable Exception that triggered this Exception
     */
    public EventException(Throwable throwable) {
        cause = throwable;
    }

    /**
     * Constructs a new EventException
     */
    public EventException() {
        cause = null;
    }

    /**
     * Constructs a new EventException with the given message
     */
    public EventException(Throwable cause, String message) {
    	super(message);
    	this.cause = cause;
    }
    
    /**
     * Constructs a new EventException with the given message
     */
    public EventException(String message) {
    	super(message);
    	cause = null;
    }
    
    /**
     * If applicable, returns the Exception that triggered this Exception
     *
     * @return Inner exception, or null if one does not exist
     */
    @Override
    public Throwable getCause() {
        return cause;
    }
}

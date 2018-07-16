package io.millesabords.camel.component.arangodb;

public class CamelArangoDbException extends Exception {  

    private static final long serialVersionUID = 5347431428477121661L;

    public CamelArangoDbException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CamelArangoDbException(final String message) {
        super(message);
    }

    public CamelArangoDbException(final Throwable cause) {
        super(cause);
    }

}
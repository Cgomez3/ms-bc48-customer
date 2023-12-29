package ms.bc48.customer.config;

public class ConfigException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private static final String DESCRIPTION = "Conflict Exception";

    public ConfigException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }
}

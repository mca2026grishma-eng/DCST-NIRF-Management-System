/**
 * Custom exception used for handling invalid NIRF-related data.
 */
public class NIRFException extends Exception {

    /**
     * Creates a new NIRFException with the specified message.
     *
     * @param message description of the exception
     */
    public NIRFException(String message) {
        super(message);
    }
}
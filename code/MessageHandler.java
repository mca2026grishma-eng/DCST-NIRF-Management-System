 /**
 * Handles message passing between objects that implement
 * the Printable interface.
 */
public class MessageHandler {

    /**
     * Sends a message to a printable object.
     *
     * @param object object implementing Printable
     */
    public static void sendMessage(Printable object) {
        object.printDetails();
    }

    /**
     * Sends a message along with additional text.
     * Demonstrates method overloading.
     *
     * @param object object implementing Printable
     * @param message message to be displayed
     */
    public static void sendMessage(
            Printable object,
            String message) {

        System.out.println("Message: " + message);
        object.printDetails();
    }
}

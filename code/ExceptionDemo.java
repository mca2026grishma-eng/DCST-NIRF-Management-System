/**
 * Demonstrates exception handling using built-in
 * and custom exceptions.
 */
public class ExceptionDemo {

    /**
     * Checks whether the student count is valid.
     *
     * @param count number of students
     * @throws NIRFException if the count is less than one
     */
    public static void checkStudentCount(int count)
            throws NIRFException {

        if (count < 1) {
            throw new NIRFException(
                    "Student count must be greater than zero."
            );
        }

        System.out.println(
                "Valid student count: " + count
        );
    }

    /**
     * Demonstrates try, catch, finally and
     * custom exception handling.
     */
    public static void demonstrate() {

        try {

            int number = 10;
            int result = number / 0;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Exception caught: Cannot divide by zero."
            );

        } finally {

            System.out.println(
                    "Finally block executed."
            );
        }

        // Custom exception

        try {

            checkStudentCount(0);

        } catch (NIRFException e) {

            System.out.println(
                    "Custom Exception: " + e.getMessage()
            );
        }
    }
}

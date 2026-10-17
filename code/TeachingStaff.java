/**
 * Represents a teaching staff member of the CST department.
 * Extends the Staff class.
 */
public class TeachingStaff extends Staff {

    /** Subject taught by the teaching staff member. */
    private String subject;

    /**
     * Creates a new TeachingStaff object.
     *
     * @param id staff ID
     * @param name staff name
     * @param email staff email
     * @param department department name
     * @param designation staff designation
     * @param subject subject taught by the staff member
     */
    public TeachingStaff(int id, String name, String email,
                         String department, String designation,
                         String subject) {

        super(id, name, email, department, designation);

        this.subject = subject;
    }

    /**
     * Displays the teaching activity of the staff member.
     */
    public void teach() {
        System.out.println(name + " teaches " + subject);
    }
}

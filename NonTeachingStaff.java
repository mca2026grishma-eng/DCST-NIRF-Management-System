/**
 * Represents a non-teaching staff member of the CST department.
 * Extends the Staff class.
 */
public class NonTeachingStaff extends Staff {

    /** Responsibility handled by the non-teaching staff member. */
    private String responsibility;

    /**
     * Creates a new NonTeachingStaff object.
     *
     * @param id staff ID
     * @param name staff name
     * @param email staff email
     * @param department department name
     * @param designation staff designation
     * @param responsibility staff responsibility
     */
    public NonTeachingStaff(int id, String name, String email,
                            String department, String designation,
                            String responsibility) {

        super(id, name, email, department, designation);

        this.responsibility = responsibility;
    }

    /**
     * Displays the duty performed by the non-teaching staff member.
     */
    public void performDuty() {
        System.out.println(name + " performs " + responsibility);
    }
}
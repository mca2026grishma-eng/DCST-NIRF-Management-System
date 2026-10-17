/**
 * Represents a staff member of the CST department.
 * Extends the Member class.
 */
public class Staff extends Member {

    /** Designation of the staff member. */
    protected String designation;

    /**
     * Creates a new Staff object.
     *
     * @param id staff ID
     * @param name staff name
     * @param email staff email
     * @param department department name
     * @param designation staff designation
     */
    public Staff(int id, String name, String email,
                 String department, String designation) {

        super(id, name, email, department);

        this.designation = designation;
    }

    /**
     * Displays staff information including designation.
     */
    public void displayStaff() {
        display();

        System.out.println("Designation: " + designation);
    }
}

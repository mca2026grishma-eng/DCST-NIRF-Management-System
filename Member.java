/**
 * Represents a member of the CST department.
 * Demonstrates constructors, access modifiers and static members.
 */
public class Member {

    /** Public member name. */
    public String name;

    /** Private member ID. */
    private int id;

    /** Private member email. */
    private String email;

    /** Protected department name. */
    protected String department;

    /** Counts the total number of Member objects created. */
    private static int memberCount = 0;

    /**
     * Creates a new Member object.
     *
     * @param id member ID
     * @param name member name
     * @param email member email
     * @param department department name
     */
    public Member(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;

        memberCount++;
    }

    /**
     * Returns the member ID.
     *
     * @return member ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the member email.
     *
     * @return member email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Updates the member email.
     *
     * @param email new email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Displays the total number of members created.
     */
    public static void displayMemberCount() {
        System.out.println("Total Members Created: " + memberCount);
    }

    /**
     * Displays member information.
     */
    public void display() {
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Email      : " + email);
        System.out.println("Department : " + department);
    }
}
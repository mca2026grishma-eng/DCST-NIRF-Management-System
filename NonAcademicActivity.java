/**
 * Represents a non-academic activity conducted by the CST department.
 * Extends Activity and implements the Printable interface.
 */
public class NonAcademicActivity extends Activity
        implements Printable {

    /** Category of the non-academic activity. */
    private String category;

    /**
     * Creates a new NonAcademicActivity object.
     *
     * @param activityName name of the activity
     * @param department department conducting the activity
     * @param category category of the activity
     */
    public NonAcademicActivity(String activityName,
                               String department,
                               String category) {

        super(activityName, department);
        this.category = category;
    }

    /**
     * Conducts the non-academic activity.
     */
    @Override
    public void conductActivity() {
        System.out.println(
                "Conducting non-academic activity."
        );
    }

    /**
     * Prints details of the non-academic activity.
     */
    @Override
    public void printDetails() {
        System.out.println(
                "Non-Academic Activity: " + activityName
        );

        System.out.println(
                "Category             : " + category
        );
    }

    /**
     * Displays the specific type of activity.
     */
    @Override
    public void showType() {
        System.out.println("This is a Non-Academic Activity.");
    }
}
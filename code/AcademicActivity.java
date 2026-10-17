/**
 * Represents an academic activity conducted by the CST department.
 * Extends Activity and implements Printable and Reportable interfaces.
 */
public class AcademicActivity extends Activity
        implements Printable, Reportable {

    /** Subject associated with the academic activity. */
    private String subject;

    /**
     * Creates a new AcademicActivity object.
     *
     * @param activityName name of the academic activity
     * @param department department conducting the activity
     * @param subject subject associated with the activity
     */
    public AcademicActivity(String activityName,
                            String department,
                            String subject) {

        super(activityName, department);
        this.subject = subject;
    }

    /**
     * Conducts the academic activity.
     */
    @Override
    public void conductActivity() {
        System.out.println(
                "Conducting academic activity for: " + subject
        );
    }

    /**
     * Prints details of the academic activity.
     */
    @Override
    public void printDetails() {
        System.out.println("Academic Activity: " + activityName);
        System.out.println("Subject         : " + subject);
    }

    /**
     * Generates a report for the academic activity.
     */
    @Override
    public void generateReport() {
        System.out.println("Academic activity report generated.");
    }

    /**
     * Displays the specific type of activity.
     */
    @Override
    public void showType() {
        System.out.println("This is an Academic Activity.");
    }
}

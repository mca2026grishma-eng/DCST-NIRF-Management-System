/**
 * Represents a general activity conducted by the CST department.
 * Demonstrates the use of an abstract class.
 */
public abstract class Activity {

    /** Name of the activity. */
    protected String activityName;

    /** Department conducting the activity. */
    protected String department;

    /**
     * Creates a new Activity object.
     *
     * @param activityName name of the activity
     * @param department department conducting the activity
     */
    public Activity(String activityName, String department) {
        this.activityName = activityName;
        this.department = department;
    }

    /**
     * Conducts the activity.
     * Implemented differently by derived classes.
     */
    public abstract void conductActivity();

    /**
     * Displays basic activity information.
     */
    public void displayActivity() {
        System.out.println("Activity   : " + activityName);
        System.out.println("Department : " + department);
    }

    /**
     * Displays the general type of activity.
     * Can be overridden by derived classes.
     */
    public void showType() {
        System.out.println("This is an Activity.");
    }
}

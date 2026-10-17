/**
 * Represents a student belonging to the CST department.
 * Extends the Member class to demonstrate inheritance.
 */
public class Student extends Member {

    /** Course in which the student is enrolled. */
    private String course;

    /** Current semester of the student. */
    private int semester;

    /**
     * Creates a new Student object.
     *
     * @param id student ID
     * @param name student name
     * @param email student email
     * @param department department name
     * @param course course name
     * @param semester current semester
     */
    public Student(int id, String name, String email,
                   String department, String course, int semester) {

        super(id, name, email, department);

        this.course = course;
        this.semester = semester;
    }

    /**
     * Displays student information including
     * course and semester.
     */
    public void displayStudent() {
        display();

        System.out.println("Course     : " + course);
        System.out.println("Semester   : " + semester);
    }
}
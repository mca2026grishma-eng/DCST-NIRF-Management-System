
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static Member m1 = new Member(
            101, "Rahul", "rahul@gmail.com", "CST");

    static Student s1 = new Student(
            201, "Priya", "priya@gmail.com",
            "CST", "MCA", 2);

    static TeachingStaff t1 = new TeachingStaff(
            301, "HHR", "hhr@gmail.com",
            "CST", "OOP", "Teaching Staff");

    static NonTeachingStaff n1 = new NonTeachingStaff(
            302, "Amit", "amit@gmail.com",
            "CST", "Lab Assistant", "Non-Teaching Staff");

    static AcademicActivity academic =
            new AcademicActivity("OOP Lab", "CST", "Academic");

    static NonAcademicActivity nonAcademic =
            new NonAcademicActivity("Sports Day", "CST", "Non-Academic");

    static List<Student> students = new ArrayList<>();

    static {
        students.add(s1);
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("     DCST NIRF MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. View Members");
            System.out.println("2. View Students");
            System.out.println("3. View Staff");
            System.out.println("4. View Activities");
            System.out.println("5. Demonstrate OOP Features");
            System.out.println("6. Generate NIRF Report");
            System.out.println("7. Register a New Student");
            System.out.println("8. View Courses and Subjects (DCST / GBS)");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        viewMembers();
                        break;

                    case 2:
                        viewStudents();
                        break;

                    case 3:
                        viewStaff();
                        break;

                    case 4:
                        viewActivities();
                        break;

                    case 5:
                        demonstrateOOP();
                        break;

                    case 6:
                        generateReport();
                        break;

                    case 7:
                        registerStudent();
                        break;

                    case 8:
                        viewCoursesAndSubjects();
                        break;

                    case 9:
                        System.out.println("Thank you for using the NIRF Management System!");
                        break;

                    default:
                        System.out.println("Invalid choice. Enter a number from 1 to 9.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                choice = 0;
            }

        } while (choice != 9);

        sc.close();
    }

    
static void viewMembers() {
    System.out.println("\n========================================");
    System.out.println("              ALL MEMBERS");
    System.out.println("========================================");

    System.out.println("\nTotal Members: " + (students.size() + 3));

    System.out.println("\n---------- MEMBER 1 ----------");
    m1.display();

    System.out.println("\n---------- MEMBER 2 ----------");
    s1.display();

    System.out.println("\n---------- MEMBER 3 ----------");
    t1.display();

    System.out.println("\n---------- MEMBER 4 ----------");
    n1.display();

    System.out.println("\n========================================");
}


    static void viewStudents() {
        System.out.println("\n===== REGISTERED STUDENTS =====");

        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        for (Student student : students) {
            student.display();
            System.out.println("------------------------------");
        }

        System.out.println("Total Students: " + students.size());
    }

   
static void viewStaff() {
    System.out.println("\n========================================");
    System.out.println("             STAFF DETAILS");
    System.out.println("========================================");

    System.out.println("\n--- TEACHING STAFF ---");
    t1.display();
    System.out.println("Staff Type : Teaching Staff");

    System.out.println("\n--- NON-TEACHING STAFF ---");
    n1.display();
    System.out.println("Staff Type : Non-Teaching Staff");

    System.out.println("\n========================================");
}


    static void viewActivities() {
        System.out.println("\n===== ACADEMIC ACTIVITIES =====");
        String[] academicActivities = {
                "ISA (Intra-Semester Assessment)",
                "Midpoint Assessment",
                "SEA (Semester-End Assessment)",
                "Study Tours and Industrial Visits",
                "Student Placements and Internships",
                "Seminars and Guest Lectures",
                "Technical Workshops and Training",
                "Research Projects and Presentations",
                "Faculty Development Programmes",
                "Project Demonstrations and Competitions",
                "OOP Lab and Practical Sessions"
        };
        for (String activity : academicActivities) {
            System.out.println("- " + activity);
        }

        System.out.println("\n===== NON-ACADEMIC ACTIVITIES =====");
        String[] nonAcademicActivities = {
                "InfoFest",
                "Plateaunia (verify event name and reporting year)",
                "Play-on (verify event name and reporting year)",
                "Sports Events and Tournaments",
                "Cultural Programmes",
                "Student Clubs and Competitions",
                "Fresher's Day and Farewell Programmes",
                "Community Outreach and Social Activities",
                "Festival Celebrations",
                "Student Development Programmes"
        };
        for (String activity : nonAcademicActivities) {
            System.out.println("- " + activity);
        }

        System.out.println("\nNote: Confirm which activities actually occurred in each of the three NIRF reporting years.");
    }

    /** Displays programme and subject information for DCST and GBS. */
    static void viewCoursesAndSubjects() {
        System.out.println("\n===== DCST: DEPARTMENT OF COMPUTER SCIENCE & TECHNOLOGY =====");
        System.out.println("Programmes listed by Goa University: MCA and Ph.D. in Computer Science");
        System.out.println("\nMCA SUBJECTS (examples from the published syllabus):");
        System.out.println("Semester I:");
        String[] semesterOne = {
                "Data Structures and Algorithms",
                "Object Oriented Concepts",
                "Operating Systems",
                "Internet Technologies",
                "Data Structures and Algorithms Lab",
                "Object Oriented Programming Lab",
                "Linux Lab"
        };
        for (String subject : semesterOne) System.out.println("- " + subject);

        System.out.println("Semester II:");
        String[] semesterTwo = {
                "Web Development",
                "Database Management Systems",
                "Machine Learning",
                "Web Development Lab",
                "Database Management Systems Lab",
                "Machine Learning Lab"
        };
        for (String subject : semesterTwo) System.out.println("- " + subject);
        System.out.println("Electives depend on the applicable syllabus and student selection.");

        System.out.println("\n===== GOA BUSINESS SCHOOL (GBS) =====");
        String[] gbsProgrammes = {
                "MBA",
                "MBA (Executive)",
                "MBA (Financial Services)",
                "M.Com.",
                "M.A. Economics",
                "M.Sc. Data Science",
                "M.Sc. Artificial Intelligence",
                "Integrated MBA (Hospitality, Travel and Tourism)",
                "Master of Library and Information Science (M.L.I.Sc.)",
                "Ph.D. programmes in Commerce, Economics and Management Studies"
        };
        for (String programme : gbsProgrammes) System.out.println("- " + programme);
        System.out.println("\nNote: Verify current programme availability and detailed subjects against the official GU syllabus before submission.");
    }

    static void demonstrateOOP() {
        System.out.println("\n===== ENUM =====");
        MemberType type = MemberType.STUDENT;
        System.out.println("Member Type: " + type);

        System.out.println("\n===== MESSAGE PASSING =====");
        MessageHandler.sendMessage(academic);
        MessageHandler.sendMessage(nonAcademic);

        System.out.println("\n===== METHOD OVERLOADING =====");
        MessageHandler.sendMessage(academic, "Academic activity details");

        System.out.println("\n===== COLLECTIONS AND GENERICS =====");
        CollectionDemo.demonstrate();

        System.out.println("\n===== EXCEPTION HANDLING =====");
        ExceptionDemo.demonstrate();

        System.out.println("\n===== ADVANCED OOP FEATURES =====");
        try {
            AdvancedFeatures.demonstrate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void registerStudent() {
        System.out.println("\n===== STUDENT REGISTRATION =====");

        System.out.print("Enter student name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.print("Enter student email: ");
        String email = sc.nextLine().trim();

        if (email.isEmpty() || !email.contains("@")) {
            System.out.println("Please enter a valid email.");
            return;
        }

        System.out.print("Enter department: ");
        String department = sc.nextLine().trim();

        if (department.isEmpty()) {
            System.out.println("Department cannot be empty.");
            return;
        }

        System.out.print("Enter course: ");
        String course = sc.nextLine().trim();

        if (course.isEmpty()) {
            System.out.println("Course cannot be empty.");
            return;
        }

        System.out.print("Enter semester: ");
        int semester;

        try {
            semester = Integer.parseInt(sc.nextLine());

            if (semester < 1) {
                System.out.println("Semester must be at least 1.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Semester must be a number.");
            return;
        }

        int studentId = 201;

        for (Student student : students) {
            if (student.getId() >= studentId) {
                studentId = student.getId() + 1;
            }
        }

        Student newStudent = new Student(
                studentId, name, email, department, course, semester);

        students.add(newStudent);

        System.out.println("\nStudent registered successfully!");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
    }

    static void generateReport() {
        System.out.println("\n===== GENERATING NIRF REPORT =====");

        try (PrintWriter writer = new PrintWriter("nirf_report.txt")) {
            writer.println("========================================");
            writer.println("     DCST NIRF MANAGEMENT SYSTEM");
            writer.println("========================================");
            writer.println();
            writer.println("REPORT SUMMARY");
            writer.println("----------------------------------------");
            writer.println("Department            : CST");
            writer.println("Programme             : MCA");
            writer.println("Total Students        : " + students.size());

            for (Student student : students) {
                writer.println("Student               : " + student.name);
            }

            writer.println("Teaching Staff        : HHR");
            writer.println("Non-Teaching Staff    : Amit (Lab Assistant)");
            writer.println();
            writer.println("ACADEMIC ACTIVITIES (verify year-wise records)");
            writer.println("ISA, Midpoint, SEA, study tours, industrial visits,");
            writer.println("placements, internships, seminars, workshops, research projects,");
            writer.println("faculty development programmes and practical labs.");
            writer.println();
            writer.println("NON-ACADEMIC ACTIVITIES (verify year-wise records)");
            writer.println("InfoFest, Plateaunia, Play-on, sports, cultural programmes,");
            writer.println("student clubs, outreach and student development activities.");
            writer.println();
            writer.println("DCST PROGRAMMES: MCA; Ph.D. in Computer Science.");
            writer.println("MCA SUBJECTS INCLUDE: Data Structures and Algorithms, Object Oriented Concepts,");
            writer.println("Operating Systems, Internet Technologies, Web Development,");
            writer.println("Database Management Systems and Machine Learning, with labs.");
            writer.println("GBS PROGRAMMES INCLUDE: MBA, MBA (Executive), MBA (Financial Services),");
            writer.println("M.Com., M.A. Economics, M.Sc. Data Science and M.Sc. Artificial Intelligence.");
            writer.println("Report period          : Past three academic/reporting years");
            writer.println("Important              : Enter verified year-wise student/staff totals and activities.");
            writer.println("Report Status         : Generated - verify figures before NIRF submission");
            writer.println("----------------------------------------");
            writer.println("End of Report");

        } catch (IOException e) {
            System.out.println("Could not generate report: " + e.getMessage());
            return;
        }

        System.out.println("\nReport generated successfully!\n");

        try (BufferedReader reader =
                     new BufferedReader(new FileReader("nirf_report.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Could not read report: " + e.getMessage());
        }
    }
}

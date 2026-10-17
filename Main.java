
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
            System.out.println("8. Exit");
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
                        System.out.println("Thank you for using the NIRF Management System!");
                        break;

                    default:
                        System.out.println("Invalid choice. Enter a number from 1 to 8.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                choice = 0;
            }

        } while (choice != 8);

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
        System.out.println("\n===== ACTIVITIES =====");

        academic.conductActivity();
        academic.displayActivity();
        academic.showType();

        System.out.println();

        nonAcademic.conductActivity();
        nonAcademic.displayActivity();
        nonAcademic.showType();
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
            writer.println("Academic Activity     : OOP Lab");
            writer.println("Non-Academic Activity : Sports Day");
            writer.println("Report Status         : Generated");
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

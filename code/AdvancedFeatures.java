
import java.io.*;
import java.lang.reflect.Field;

/**
 * Demonstrates object referencing, reflection, persistence,
 * file I/O, RTTI, and shallow and deep cloning.
 */
public class AdvancedFeatures {

    /**
     * Represents an address.
     */
    static class Address implements Cloneable, Serializable {
        private static final long serialVersionUID = 1L;

        String city;

        public Address(String city) {
            this.city = city;
        }

        @Override
        public Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }
    }

    /**
     * Represents a student record.
     */
    static class StudentRecord implements Cloneable, Serializable {
        private static final long serialVersionUID = 1L;

        String name;
        Address address;

        public StudentRecord(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        // Shallow cloning
        @Override
        public StudentRecord clone() throws CloneNotSupportedException {
            return (StudentRecord) super.clone();
        }

        // Deep cloning
        public StudentRecord deepClone()
                throws CloneNotSupportedException {
            StudentRecord copy = clone();
            copy.address = address.clone();
            return copy;
        }
    }

    /**
     * Demonstrates all advanced features.
     */
    public static void demonstrate() throws Exception {

        // OBJECT REFERENCING
        System.out.println("\n===== OBJECT REFERENCING =====");

        StudentRecord original =
                new StudentRecord("Rahul", new Address("Goa"));

        StudentRecord reference = original;
        reference.name = "Rahul Naik";

        System.out.println("Original name: " + original.name);
        System.out.println("Same object: " + (original == reference));


        // SHALLOW CLONING
        System.out.println("\n===== SHALLOW CLONING =====");

        StudentRecord shallow = original.clone();
        shallow.address.city = "Pune";

        System.out.println("Original city: " + original.address.city);
        System.out.println("Shallow copy city: " + shallow.address.city);


        // DEEP CLONING
        System.out.println("\n===== DEEP CLONING =====");

        original.address.city = "Goa";

        StudentRecord deep = original.deepClone();
        deep.address.city = "Mumbai";

        System.out.println("Original city: " + original.address.city);
        System.out.println("Deep copy city: " + deep.address.city);


        // REFLECTION
        System.out.println("\n===== REFLECTION =====");

        Class<?> clazz = original.getClass();

        System.out.println("Class name: " + clazz.getName());

        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("Field: " + field.getName());
        }


        // RTTI
        System.out.println("\n===== RTTI =====");

        Object object = original;

        if (object instanceof StudentRecord) {
            System.out.println(
                    "Runtime type: " +
                    object.getClass().getSimpleName()
            );
        }


        // PERSISTENCE
        System.out.println("\n===== PERSISTENCE =====");

        try (ObjectOutputStream output =
                     new ObjectOutputStream(
                             new FileOutputStream("student_data.ser"))) {
            output.writeObject(original);
        }

        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream("student_data.ser"))) {

            StudentRecord saved =
                    (StudentRecord) input.readObject();

            System.out.println("Restored student: " + saved.name);
            System.out.println("Restored city: " + saved.address.city);
        }


        // FILE I/O
        System.out.println("\n===== FILE I/O =====");

        
try (PrintWriter writer =
         new PrintWriter("nirf_report.txt")) {

    writer.println("========================================");
    writer.println("     DCST NIRF MANAGEMENT SYSTEM");
    writer.println("========================================");
    writer.println();
    writer.println("REPORT SUMMARY");
    writer.println("----------------------------------------");
    writer.println("Department          : CST");
    writer.println("Academic Activity   : OOP Lab");
    writer.println("Non-Academic Activity: Sports Day");
    writer.println("Programme           : MCA");
    writer.println("Report Status       : Generated");
    writer.println("----------------------------------------");
    writer.println("End of Report");
}


        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(
                            "nirf_report.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

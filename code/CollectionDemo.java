import java.util.*;

/**
 * Demonstrates the use of Java Collections and Generics
 * in the CST management system.
 */
public class CollectionDemo {

    /**
     * Demonstrates List, Queue, Set, Map and Generic Class.
     */
    public static void demonstrate() {

        // ================= LIST =================

        List<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Data Structures");
        subjects.add("Operating Systems");

        System.out.println("\n===== LIST =====");

        for (String subject : subjects) {
            System.out.println(subject);
        }


        // ================= QUEUE =================

        Queue<String> activities = new LinkedList<>();

        activities.add("OOP Lab");
        activities.add("Seminar");
        activities.add("Workshop");

        System.out.println("\n===== QUEUE =====");

        while (!activities.isEmpty()) {
            System.out.println(activities.poll());
        }


        // ================= SET =================

        Set<String> programs = new HashSet<>();

        programs.add("MCA");
        programs.add("MCA");
        programs.add("BCA");

        System.out.println("\n===== SET =====");
        System.out.println(programs);


        // ================= MAP =================

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Grishma");
        studentMap.put(102, "Rahul");
        studentMap.put(103, "Student");

        System.out.println("\n===== MAP =====");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(
                    "ID: " + entry.getKey()
                    + " Name: " + entry.getValue()
            );
        }


        // ================= GENERIC CLASS =================

        GenericRepository<String> repository =
                new GenericRepository<>();

        repository.add("Academic Activity");
        repository.add("Non-Academic Activity");

        System.out.println("\n===== GENERIC CLASS =====");

        repository.display();

        System.out.println("Total Items: " + repository.size());
        System.out.println("\n===== GENERIC METHOD =====");
        repository.displayItem("NIRF Management System");
    }
}

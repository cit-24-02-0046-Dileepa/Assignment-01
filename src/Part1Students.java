package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Part1Students {

    public static void main(String[] args) {

        // 1. Create HashMap and add students
        HashMap<String, String[]> students = new HashMap<>();

        students.put("S001", new String[]{"Kamal", "85"});
        students.put("S002", new String[]{"Nimal", "72"});
        students.put("S003", new String[]{"Amal", "90"});
        students.put("S004", new String[]{"Sunil", "65"});
        students.put("S005", new String[]{"Ravi", "78"});

        // 2. Display all students
        System.out.println("---- Student Details ----");
        for (Map.Entry<String, String[]> entry : students.entrySet()) {
            System.out.println(
                "Index: " + entry.getKey() +
                ", Name: " + entry.getValue()[0] +
                ", Marks: " + entry.getValue()[1]
            );
        }

        // 3. Update marks of S004 – Sunil to 75
        students.put("S004", new String[]{"Sunil", "75"});

        // 4. Delete student S003 – Amal
        students.remove("S003");

        // 5. Check if S005 – Ravi exists
        if (students.containsKey("S005")) {
            System.out.println("\nS005 – Ravi is in the HashMap.");
        } else {
            System.out.println("\nS005 – Ravi is NOT in the HashMap.");
        }
    }
}

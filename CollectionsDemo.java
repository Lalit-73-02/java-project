import java.util.*;

/**
 * Advanced Java: Collections and Generics Demo
 */

class Student implements Comparable<Student> {
    int id;
    String name;
    double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Natural ordering by ID
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Grade: %.1f", id, name, grade);
    }
}

public class CollectionsDemo {
    
    // Generic Method Example
    public static <T> void printList(List<T> list) {
        System.out.println("Printing List Elements:");
        for (T item : list) {
            System.out.println(" - " + item);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. ArrayList with Generics
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Alice", 88.5));
        students.add(new Student(101, "Bob", 92.0));
        students.add(new Student(102, "Charlie", 85.0));

        System.out.println("Before Sorting:");
        printList(students);

        // 2. Sorting using Comparable (Natural - by ID)
        Collections.sort(students);
        System.out.println("After Sorting (by ID):");
        printList(students);

        // 3. Sorting using Comparator (Custom - by Grade Descending)
        students.sort((s1, s2) -> Double.compare(s2.grade, s1.grade));
        System.out.println("After Sorting (by Grade Descending):");
        printList(students);

        // 4. Using a Map (HashMap)
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : students) {
            studentMap.put(s.id, s);
        }

        System.out.println("Map lookup for ID 102: " + studentMap.get(102));
        
        // 5. Using a Set (TreeSet for auto-sorting)
        Set<String> nicknames = new TreeSet<>();
        nicknames.add("Zeta");
        nicknames.add("Alpha");
        nicknames.add("Beta");
        System.out.println("\nTreeSet (Auto-sorted): " + nicknames);
    }
}

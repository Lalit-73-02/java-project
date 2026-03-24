import java.util.ArrayList;

public class Practicess {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> students = new ArrayList<>();

        // Add 10 student names
        students.add("Rahul");
        students.add("Amit");
        students.add("Neha");
        students.add("Priya");
        students.add("Rohit");
        students.add("Simran");
        students.add("Karan");
        students.add("Anjali");
        students.add("Vikas");
        students.add("Pooja");

        // Print using for-each loop
        System.out.println("Student List:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
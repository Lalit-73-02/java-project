import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println(id + " | " + name + " | " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- Student Management -----");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Marks");
            System.out.println("6. Show Topper");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){

                // ADD STUDENT
                case 1:
                    System.out.print("Enter Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;
                    for(Student s : list){
                        if(s.id == id){
                            exists = true;
                            break;
                        }
                    }

                    if(exists){
                        System.out.println("ID already exists!");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    list.add(new Student(id, name, marks));
                    System.out.println("Student Added!");
                    break;

                // VIEW STUDENTS
                case 2:
                    if(list.isEmpty()){
                        System.out.println("No students found!");
                    } else {
                        for(Student s : list){
                            s.display();
                        }
                    }
                    break;

                // SEARCH STUDENT
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searched = sc.nextInt();
                    boolean found = false;

                    for(Student s : list){
                        if(s.id == searched){
                            s.display();
                            found = true;
                        }
                    }

                    if(!found){
                        System.out.println("Student not found!");
                    }
                    break;

                // DELETE STUDENT
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = list.removeIf(s -> s.id == deleteId);

                    if(removed){
                        System.out.println("Student deleted!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                // UPDATE MARKS
                case 5:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;

                    for(Student s : list){
                        if(s.id == updateId){
                            System.out.print("Enter new marks: ");
                            s.marks = sc.nextInt();
                            updated = true;
                        }
                    }

                    if(updated){
                        System.out.println("Marks updated!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                // SHOW TOPPER
                case 6:
                    if(list.isEmpty()){
                        System.out.println("No students available!");
                    } else {
                        Student top = list.get(0);

                        for(Student s : list){
                            if(s.marks > top.marks){
                                top = s;
                            }
                        }

                        System.out.println("Topper:");
                        top.display();
                    }
                    break;
            }

        } while(choice != 7);

        System.out.println("Program Ended");
        sc.close();
    }
}
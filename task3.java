
/*
 * Create a console-based system where administrators can interact
 with the application. Implement features for adding, updating, and
 removing student records, and retrieving student details. Use
 ArrayLists or HashMaps to store and manage student records
 */
package Task;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class StudentDetails {
    private List<Student> students;
    private Scanner nn;

    StudentDetails(Scanner nn) {
        this.nn = nn;
        this.students = new ArrayList<>();
    }

    public void add() {
        System.out.println("Enter student name:");
        String name = nn.next();
        System.out.println("Enter student ID:");
        int id = nn.nextInt();
        students.add(new Student(name, id));
        System.out.println("Student added successfully.");
    }

    public void delete() {
        System.out.println("Enter student ID to delete:");
        int id = nn.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void update() {
        System.out.println("Enter student ID to update:");
        int id = nn.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Enter new name:");
                String newName = nn.next();
                student.setName(newName);
                System.out.println("Student updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void display() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            System.out.println("Student Records:");
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
            }
        }
    }
}

public class task3 {
    public static void main(String[] args) {
        Scanner nn = new Scanner(System.in);
        StudentDetails studentDetails = new StudentDetails(nn);

        while (true) {
            System.out.println("Please select the operation: 1.Add  2.Delete  3.Update  4.Display  5.Exit");
            int choice = nn.nextInt();
            switch (choice) {
                case 1:
                    studentDetails.add();
                    break;
                case 2:
                    studentDetails.delete();
                    break;
                case 3:
                    studentDetails.update();
                    break;
                case 4:
                    studentDetails.display();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    nn.close();
                    return;
                default:
                    System.out.println("Invalid operation: Please select a correct operation.");
            }
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void registerStudent() {
        System.out.print("------------------------------------------------------------------\n");
        System.out.print("Enter name, stdid, gender > ");
        String name = sc.next();
        String stdid = sc.next();
        String gender = sc.next();

        System.out.print("Enter address > ");
        String address = sc.next();

        System.out.print("Enter phone number > ");
        String phoneNumber = sc.next();

        System.out.print("Enter whether or not you are a return student (Y/N) > ");
        String returnYn = sc.next();
        boolean isReturn = returnYn.equalsIgnoreCase("Y");

        students.add(new Student(name, stdid, gender, address, phoneNumber, isReturn));
        System.out.println("A total of " + students.size() + " people were registered");
    }

    public void modifyStudent() {
        listStudents();
        System.out.print("Enter number to modify > ");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < students.size()) {
            System.out.print("Enter name, stdid, gender > ");
            String name = sc.next();
            String stdid = sc.next();
            String gender = sc.next();

            System.out.print("Enter address > ");
            String address = sc.next();

            System.out.print("Enter phone number > ");
            String phoneNumber = sc.next();

            System.out.print("Enter whether or not you are a return student (Y/N) > ");
            String returnYn = sc.next();
            boolean isReturn = returnYn.equalsIgnoreCase("Y");

            students.set(index, new Student(name, stdid, gender, address, phoneNumber, isReturn));
        } 
        else  System.out.println("Invalid number.");

    }

    public void removeStudent() {
        listStudents();
        System.out.print("Enter number to remove > ");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < students.size()) {
            students.remove(index);
            System.out.println("Removed.");
        } 
        else System.out.println("Invalid number.");
    }

    public void listStudents() {
        System.out.print("------------------------------------------------------------------\n");
        System.out.printf("%-7s %-8s %-15s %-8s %-10s %-15s %-10s\n", 
            "no", "name", "stdid", "gender", "address", "phone number", "return student");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.printf("%-7d %-8s %-15s %-8s %-10s %-15s %-10s\n",
                    i + 1, s.name, s.stdid, s.gender, s.address, s.phoneNumber, s.isReturnStudent ? "Y" : "N");
        }
    }

    public void listReturnStudents() {
        System.out.print("------------------------------------------------------------------\n");
        System.out.printf("%-7s %-8s %-15s %-8s %-10s %-15s %-10s\n", 
            "no", "name", "stdid", "gender", "address", "phone number", "return student");

        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.isReturnStudent) {
                System.out.printf("%-7d %-8s %-15s %-8s %-10s %-15s %-10s\n",
                        i + 1, s.name, s.stdid, s.gender, s.address, s.phoneNumber, "Y");
                count++;
            }
        }
        if (count == 0) System.out.println("No return students found.");
    }

    public void searchByName() {
        System.out.print("------------------------------------------------------------------\n");
        System.out.print("Enter name to search > ");
        String keyword = sc.next();

        System.out.println("Searched");
        printStudentsByCondition(s -> s.name.contains(keyword));
    }

    public void searchByAddress() {
        System.out.print("------------------------------------------------------------------\n");
        System.out.print("Enter address to search > ");
        String keyword = sc.next();

        System.out.println("Searched");
        printStudentsByCondition(s -> s.address.contains(keyword));
    }

    private void printStudentsByCondition(java.util.function.Predicate<Student> condition) {
        System.out.printf("%-7s %-8s %-15s %-8s %-10s %-15s %-10s\n", 
            "no", "name", "stdid", "gender", "address", "phone number", "return student");

        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (condition.test(s)) {
                System.out.printf("%-7d %-8s %-15s %-8s %-10s %-15s %-10s\n",
                        i + 1, s.name, s.stdid, s.gender, s.address, s.phoneNumber, s.isReturnStudent ? "Y" : "N");
                count++;
            }
        }
        if (count == 0) System.out.println("No matching students found.");
    }
}

import java.util.Scanner;

public class L04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("------------------------------------------------------------------");
            System.out.print("1) register, 2) modify, 3) remove, 4) list, 5) search name\n" + "6) list (return student), 7) search address, 8) exit > ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: manager.registerStudent(); break;
                case 2: manager.modifyStudent(); break;
                case 3: manager.removeStudent(); break;
                case 4: manager.listStudents(); break;
                case 5: manager.searchByName(); break;
                case 6: manager.listReturnStudents(); break;
                case 7: manager.searchByAddress(); break;
                case 8:
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Ended");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

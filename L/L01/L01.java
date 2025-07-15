import java.util.Scanner;

public class L01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuManager manager = new MenuManager();

        while (true) {
            System.out.print("1) add, 2) modify, 3) remove, 4) list, 5) total number, 6) exit > ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: manager.addMenu(); break;
                case 2: manager.modifyMenu(); break;
                case 3: manager.removeMenu(); break;
                case 4: manager.listMenu(); break;
                case 5: manager.totalNumber(); break;
                case 6:
                    System.out.println("Ended");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

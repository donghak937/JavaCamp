import java.util.Scanner;

public class L03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderManager manager = new OrderManager();

        while (true) {
            System.out.println("------------------------------------------------------------------");
            System.out.print("1) order, 2) pay, 3) list, 4) exit > ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: manager.order(); break;
                case 2: manager.pay(); break;
                case 3: manager.list(); break;
                case 4:
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Ended");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

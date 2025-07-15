import java.util.Scanner;

public class L02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of available parking lots > ");
        int capacity = sc.nextInt();

        ParkingManager manager = new ParkingManager(capacity);

        while (true) {
            System.out.print("1) enter, 2) departure, 3) list, 4) total, 5) Remaining, 6) exit > ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: manager.enter(); break;
                case 2: manager.departure(); break;
                case 3: manager.list(); break;
                case 4: manager.total(); break;
                case 5: manager.remaining(); break;
                case 6:
                    System.out.println("Program Ended.");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

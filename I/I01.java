import java.util.Scanner;

public class I01 {
    void ShowMenu() {
        System.out.println("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");
    }

    public static void main(String[] args) {
        I01 a = new I01();
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int choice;

        while (true) {
            a.ShowMenu();
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.printf("Total price is %d\n", total);
                break;
            }

            if (choice == 1) total += 15000;
            else if (choice == 2) total += 10000;
            else if (choice == 3) total += 7000;
            else if (choice == 4) total += 2000;
            else continue;

            System.out.printf("Order price from now on is %d\n", total);
        }
    }
}

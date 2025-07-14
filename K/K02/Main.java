import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of menu > ");
        int menuCount = sc.nextInt();

        MenuPan[] menus = new MenuPan[menuCount];

        for (int i = 0; i < menuCount; i++) {
            System.out.printf("%d: Enter number, name, origin, price > ", i + 1);
            int num = sc.nextInt();
            String name = sc.next();
            String origin = sc.next();
            int price = sc.nextInt();

            menus[i] = new MenuPan();
            menus[i].input(num, name, origin, price);
        }

        System.out.println("================================================");
        System.out.printf("%3s     %-7s %-9s %6s\n", "num", "name", "origin", "price");
        for (MenuPan menu : menus) {
            menu.printall();
        }

        sc.close();
    }
}

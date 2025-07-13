import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuPan menu = new MenuPan();

        System.out.print("Enter number, name, origin, price > ");
        int num = sc.nextInt();
        String name = sc.next();
        String origin = sc.next();
        int price = sc.nextInt();

        menu.input(num, name, origin, price);
        menu.printall();

    }
}

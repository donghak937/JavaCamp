package L.L01;

public class MenuManager {
    
}
import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {
    Scanner sc = new Scanner(System.in);
    ArrayList<Menu> menus = new ArrayList<>();

    public void addMenu() {
        System.out.print("Enter name, origin, price > ");
        String name = sc.next();
        String origin = sc.next();
        int price = sc.nextInt();

        menus.add(new Menu(name, origin, price));
    }

    public void modifyMenu() {
        listMenu();
        System.out.print("Enter a number to modify > ");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < menus.size()) {
            System.out.print("Enter name, origin, price > ");
            String name = sc.next();
            String origin = sc.next();
            int price = sc.nextInt();

            menus.set(index, new Menu(name, origin, price));
        } else {
            System.out.println("Invalid number.");
        }
    }

    public void removeMenu() {
        listMenu();
        System.out.print("Enter a number to remove > ");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < menus.size()) {
            menus.remove(index);
            System.out.println("Removed");
        } else {
            System.out.println("Invalid number.");
        }
    }

    public void listMenu() {
        System.out.println("================================================");
        System.out.printf("%-8s %-15s %-15s %-10s\n", "num", "name", "origin", "price");
        for (int i = 0; i < menus.size(); i++) {
            Menu m = menus.get(i);
            System.out.printf("%-8d %-15s %-15s %-10d\n", i + 1, m.name, m.origin, m.price);
        }
    }

    public void totalNumber() {
        System.out.println("Number of registered menu is " + menus.size());
    }
}

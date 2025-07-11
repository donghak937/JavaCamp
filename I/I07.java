import java.util.Scanner;

class Main {
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i07();
    }

    void i07() {
        int totalPrice = 0;
        int count = 0;
        String more;

        do {
            int price = SelectCan();
            totalPrice += price;
            count++;

            System.out.print("Do you need more menu? (Y/N) > ");
            more = s.next();
        } while (more.equalsIgnoreCase("Y"));

        System.out.printf("Total price for %d drinks is %d\n", count, totalPrice);
    }

    int SelectCan() {
        int[] price = {700, 300, 1000, 500, 600};

        System.out.println("1. Cola(700) 2. coffee(300) 3. lemon tea(1000) 4. milk tea(500) 5. cocoa(600)");
        System.out.print("Please select menu > ");
        int menu = s.nextInt();

        if (menu >= 1 && menu <= 5) return price[menu - 1];
        
        else {
            System.out.println("Invalid selection. Price set to 0.");
            return 0;
        }
    }
}

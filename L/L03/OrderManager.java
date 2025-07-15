import java.util.ArrayList;
import java.util.Scanner;

public class OrderManager {
    ArrayList<Order> orders = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void order() {
        System.out.println("------------------------------------------------------------------");
        System.out.print("Enter number of customer > ");
        int customerCount = sc.nextInt();

        System.out.print("Enter number of menu(steak, spaghetti, pasta) > ");
        int steak = sc.nextInt();
        int spaghetti = sc.nextInt();
        int pasta = sc.nextInt();

        System.out.print("Enter whether you have a membership card (Y/N) > ");
        String memYn = sc.next();
        boolean hasMembership = memYn.equalsIgnoreCase("Y");

        Order o = new Order(customerCount, steak, spaghetti, pasta, hasMembership);
        orders.add(o);

        System.out.println("Entery time is : " + o.entryTime);
        System.out.println("Total price is : " + calculateTotalPrice(o));
    }

    public void pay() {
        if (orders.isEmpty()) {
            System.out.println("No orders to pay.");
            return;
        }

        list();
        System.out.print("Enter the number you wish to pay > ");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < orders.size()) {
            orders.remove(index);
            System.out.println("Paid.");
        } 
        else System.out.println("Invalid number.");
    }

    public void list() {
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-5s %-5s %-8s %-12s %-8s %-12s %-10s\n", 
            "no", "num", "steak", "spaghetti", "pasta", "membership", "entry-time");

        for (int i = 0; i < orders.size(); i++) {
            Order o = orders.get(i);
            System.out.printf("[%d] %-5d %-8d %-12d %-8d %-12s %-10s\n",
                i + 1, o.customerCount, o.steakCount, o.spaghettiCount, o.pastaCount, 
                o.hasMembership ? "Y" : "N", o.entryTime.toString());
        }
    }

    private long calculateTotalPrice(Order o) {
        int steakPrice = 25000;
        int spaghettiPrice = 15000;
        int pastaPrice = 17000;

        long mealPrice = o.steakCount * steakPrice + o.spaghettiCount * spaghettiPrice + o.pastaCount * pastaPrice;

        if (o.hasMembership) mealPrice *= 0.9;
        

        if (mealPrice < 100000) mealPrice *= 1.07;
    
        else mealPrice *= 1.10;
        
        mealPrice *= 1.10; 

        return Math.round(mealPrice);
    }
}

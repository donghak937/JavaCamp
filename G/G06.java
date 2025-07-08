import java.util.Scanner;

public class G06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] order = {0, 0, 0};
        int sale;
        int total_sale = 0;
        int[] total_order = {0, 0, 0};
        int[] price = {10000, 6000, 3000};
        int i;

        System.out.println("There are three type of products");
        System.out.println("(1. Leather gloves, 2. Wool gloves, 3. Vinyl gloves)");

        while (true) {
            sale = 0;

            for (int j = 0; j < 3; j++) {
                System.out.printf("How many %s products do you want to buy? > ", getOrder(j));
                order[j] = sc.nextInt();
                sale += order[j] * price[j];
                total_order[j] += order[j];
            }

            if (order[0] == 0 && order[1] == 0 && order[2] == 0) break;

            total_sale += sale;
            System.out.printf("The price is %d\n\n", sale);
        }

        System.out.printf("Total price from now on is %d\n", total_sale);
    }

    public static String getOrder(int index) {
        switch (index) {
            case 0: return "first";
            case 1: return "second";
            case 2: return "third";
            default: return "";
        }
    }
}

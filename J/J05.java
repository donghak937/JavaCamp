import java.util.Scanner;

public class J05 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCars = 0;
        int totalPrice = 0;

        while (true) {
            System.out.printf("Enter parking start time of %dth car (H M) > ", totalCars + 1);
            int startH = sc.nextInt();
            int startM = sc.nextInt();

            System.out.printf("Enter parking end time of %dth car (H M) > ", totalCars + 1);
            int endH = sc.nextInt();
            int endM = sc.nextInt();

            int price = CalcParking(startH, startM, endH, endM);
            System.out.println("Parking price : " + price);

            totalCars++;
            totalPrice += price;

            System.out.print("Do you want to enter more? (Y/N) > ");
            char answer = sc.next().toUpperCase().charAt(0);
            if (answer == 'N') break;
        }

        System.out.printf("Total price for %d cars is %d\n", totalCars, totalPrice);

    }

    public static int CalcParking(int starth, int startm, int endh, int endm) {
        int startTotal = starth * 60 + startm;
        int endTotal = endh * 60 + endm;
        int duration = endTotal - startTotal;

        if (duration <= 0) return 0;

        int unit = (duration + 9) / 10;
        return unit * 500;
    }
}

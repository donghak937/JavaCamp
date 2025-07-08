import java.util.Scanner;

public class G05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour, minute;
        int charge;
        int total_charge = 0;

        while (true) {
            System.out.print("Enter hours and minutes of use > ");
            hour = sc.nextInt();
            minute = sc.nextInt();

            if (hour == 0 && minute == 0) break;

            charge = ((hour * 60 + minute + 29) / 30) * 1000;

            if (hour >= 5) charge = (int)(charge * 0.8);
            else if (hour >= 3) charge = (int)(charge * 0.9);
            else if (hour >= 2) charge = (int)(charge * 0.95);

            System.out.printf("Your charge is %d\n\n", charge);
            total_charge += charge;
        }

        System.out.printf("Your total charge is %d\n", total_charge);
    }
}

import java.util.Scanner;

public class D09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan;

        while (true) {
            System.out.print("Enter number of gugudan(2~9) > ");
            dan = sc.nextInt();

            if (dan < 2 || dan > 9) System.out.println("Invalid input");
            else break;
            
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }

    }
}

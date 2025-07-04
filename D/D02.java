import java.util.Scanner;

public class D02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int max_num = 0;
        int min_num = 100;

        while (true) {
            System.out.print("Enter a number > ");
            number = sc.nextInt();

            if (number < 0 || number > 100) break;

            if (number > max_num) max_num = number;

            if (number < min_num) min_num = number;
        }

        System.out.println("Max number is " + max_num + ", Min number is " + min_num);

    }
}

import java.util.Scanner;

public class D01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int totalsum = 0;
        int i;

        System.out.printf("Enter a number > ");
        number = scanner.nextInt();

        if (number <= 1) System.out.println("Invalid input");
        else {
            for (i = 1; i <= number; i++) {
                totalsum += i;
            }
            System.out.println("The sum of all integer from 1 to the number entered is " + totalsum);
        }

    }
}

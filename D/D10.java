import java.util.Scanner;

public class D10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.printf("Enter two numbers > ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if ((i % num1 == 0 && i % num2 != 0) || (i % num1 != 0 && i % num2 == 0)) {
                System.out.print(i + " ");
            }
        }

    }
}

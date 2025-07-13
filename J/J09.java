import java.util.Scanner;

public class J09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int result;

        System.out.print("Enter two numbers > ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        result = power(num1, num2);
        System.out.println(num2 + " square of " + num1 + " is " + result);

    }

    public static int power(int n, int a) {
        int half;
        if (a == 0) return 1;
        if (a == 1) return n;

        half = power(n, a / 2);

        if (a % 2 == 0) return half * half;
        else return half * half * n;
    }
}

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;
        int max_num, min_num;

        System.out.print("Enter first number > ");
        num1 = sc.nextInt();

        System.out.print("Enter second number > ");
        num2 = sc.nextInt();

        System.out.print("Enter third number > ");
        num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) max_num = num1;
        else if (num2 >= num1 && num2 >= num3) max_num = num2;
        else max_num = num3;

        if (num1 <= num2 && num1 <= num3) min_num = num1;
        else if (num2 <= num1 && num2 <= num3)  min_num = num2;
        else min_num = num3;

        System.out.println("Max number is " + max_num + ", Min number is " + min_num);
    }
}

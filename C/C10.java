import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, result = 0;
        String operator;

        System.out.print("Enter number1 > ");
        num1 = sc.nextInt();

        System.out.print("Enter number2 > ");
        num2 = sc.nextInt();

        System.out.print("Enter a math symbol ('+', '-', '*', '/') > ");
        operator = sc.next();

        if (operator.equals("+")) result = num1 + num2;
        else if (operator.equals("-")) result = num1 - num2;
        else if (operator.equals("*")) result = num1 * num2;
        else result = num1 / num2;

        System.out.println("Result is " + result);
    }
}

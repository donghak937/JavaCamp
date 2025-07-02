import java.util.Scanner;

public class B08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3; // 첫 번째 숫자, 두 번째 숫자, 세 번째 숫자
        
        System.out.printf("Enter first number ");
        num1 = sc.nextInt();
        
        System.out.printf("Enter second number ");
        num2 = sc.nextInt();
        
        System.out.printf("Enter third number ");
        num3 = sc.nextInt();

        if (num1 == num2 || num2 == num3 || num1 == num3) System.out.println("Satisfies the first condition");
        if ((num1 >= 50 && num2 >= 50) || (num2 >= 50 && num3 >= 50) || (num1 >= 50 && num3 >= 50))
            System.out.println("Satisfies the second condition");
        if ((num1 + num2 == num3) || (num2 + num3 == num1) || (num1 + num3 == num2))
            System.out.println("Satisfies the third condition");    
        if ((num2 % num1 == 0 && num3 % num1 == 0) || (num1 % num2 == 0 && num3 % num2 == 0) || (num2 % num3 == 0 && num1 % num3 == 0))
            System.out.println("Satisfies the fourth condition");
        
    }
}

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income; // 연봉 (원 단위)
        int tax;    // 소득세 (원 단위)

        System.out.print("Enter your annual income (won) > ");
        income = sc.nextInt();

        if (income < 10000000) tax = (int)(income * 0.095);
        else if (income < 40000000) tax = (int)(income * 0.19);
        else if (income < 80000000) tax = (int)(income * 0.28);
        else tax = (int)(income * 0.37);

        System.out.println("Your tax is " + tax);

    }
}

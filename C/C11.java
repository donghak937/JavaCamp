import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("Enter a year > ");
        year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) System.out.println("This year is leap year");
        else System.out.println("This year is not leap year");
    }
}

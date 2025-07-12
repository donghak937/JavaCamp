import java.util.Scanner;

public class J04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first day (month day) > ");
        int month1 = sc.nextInt();
        int day1 = sc.nextInt();

        System.out.print("Enter second day (month day) > ");
        int month2 = sc.nextInt();
        int day2 = sc.nextInt();

        int date1 = CalcDate(month1, day1);
        int date2 = CalcDate(month2, day2);

        if (date1 == -1 || date2 == -1)System.out.println("Invalid input!");

        else {
            int diff = Math.abs(date1 - date2);
            System.out.println("The interval between two dates is " + diff + " day");
        }

    }

    public static int CalcDate(int month, int day) {
        int total = 0;
        int[] monthdays = { 31,28,31,30,31,30,31,31,30,31,30,31 };

        if (month < 1 || month > 12) return -1;
        if (day < 1 || day > monthdays[month - 1]) return -1;

        for (int i = 0; i < month - 1; i++) {
            total += monthdays[i];
        }
        
        total += day;

        return total;
    }
}

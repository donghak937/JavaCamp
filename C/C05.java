import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month, day; // 월, 일
        int day_count; // 1년 중 날 수

        System.out.print("Enter a month > ");
        month = scanner.nextInt();

        System.out.print("Enter a day > ");
        day = scanner.nextInt();

        day_count = 0;

        switch (month) {
            case 12: day_count += 30; 
            case 11: day_count += 31; 
            case 10: day_count += 30; 
            case 9:  day_count += 31; 
            case 8:  day_count += 31; 
            case 7:  day_count += 30; 
            case 6:  day_count += 31; 
            case 5:  day_count += 30; 
            case 4:  day_count += 31;
            case 3:  day_count += 28; 
            case 2:  day_count += 31; 
            case 1:  break;
            default:
                System.out.println("This date is not valid.");
                return;
        }

        day_count += day;

        System.out.println("This date is " + day_count + "th of the year");
    }
}

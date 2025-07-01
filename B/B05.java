import java.util.Scanner;

public class B05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days; // 날 수
        int seconds; // 초 단위 시간 
        System.out.printf("Enter number of days > ");
        days = sc.nextInt();

        seconds = days * 24 * 60 * 60;
        System.out.printf("Total seconds is %d", seconds);
        if (seconds >= 1000000) {
            System.out.printf("\nIt includes million seconds %d times\n", seconds / 1000000);
        }
    }
}

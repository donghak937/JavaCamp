import java.util.Scanner;

public class J07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Enter a number. (0 for exit) > ");
            n = sc.nextInt();
            if (n == 0) break;

            int result = poweroftwo(n);
            System.out.println(n + " square of 2 is " + result);
        }
    }

    public static int poweroftwo(int n) {
        if (n == 0) return 1;
        return 2 * poweroftwo(n - 1);
    }
}

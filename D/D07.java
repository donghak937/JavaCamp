import java.util.Scanner;

public class D07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b; // 1차 함수의 계수 a, b
        int x_begin, x_end; // x좌표의 시작 값과 끝 값
        int x, y; // x좌표, y좌표

        System.out.print("Enter the coefficients a and b of linear function(y=ax+b) > ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print("Enter the start and end values of x coordinates > ");
        x_begin = sc.nextInt();
        x_end = sc.nextInt();

        for (x = x_begin; x <= x_end; x++) {
            y = a * x + b;
            System.out.printf("coordinates (%d, %d)\n", x, y);
        }
    }
}

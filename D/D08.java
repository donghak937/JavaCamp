import java.util.Scanner;

public class D08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c; // 2차 함수의 계수 a, b, c
        int x_begin, x_end; // x좌표의 시작 값과 끝 값
        int x, y; // x좌표, y좌표

        System.out.printf("Enter the coefficients a, b and c of quadratic function(y=ax^2+bx+c) > ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.printf("Enter the start and end values of x coordinates > ");
        x_begin = sc.nextInt();
        x_end = sc.nextInt();

        for (x = x_begin; x <= x_end; x++) {
            y = a * x * x + b * x + c;
            System.out.printf("coordinates (%d, %d)\n", x, y);
        }

    }
}

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mode; // 출력모드(1: 홀수단, 2: 짝수단)
        int i, j; // 반복문 사용을 위한 변수

        System.out.print("Enter a type of gugudan (1: odd, 2: even) > ");
        mode = sc.nextInt();

        for (i = 2; i <= 9; i++) {
            if (mode == 1 && i % 2 == 0) continue;
            
            if (mode == 2 && i % 2 != 0) continue;

            for (j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %2d\t", i, j, i * j);
                if (j % 3 == 0) System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}

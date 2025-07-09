import java.util.Scanner;

public class H06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number[] = new int[5]; // 입력받은 5개의 숫자 리스트
        int pow_value[][] = new int[5][5]; //임의의 두 수 a, b로 만들 수 있는 a, b의 값 들, 5 * 5 리스트
        int max, min; // 최댓값과 최솟값
        int max_a = 0, max_b = 0; // 최댓값을 만들어 내는 경우의 a와 b의 값 
        int min_a = 0, min_b = 0; // 최솟값을 만들어 내는 경우의 a와 b의 값
        int i, j; // 반복문을 위한 변수

        System.out.print("Enter 5 numbers from 2 to 9 > ");
        for (i = 0; i < 5; i++) {
            number[i] = sc.nextInt();
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i == j) continue;

                pow_value[i][j] = (int) Math.pow(number[i], number[j]);

                if (pow_value[i][j] > max) {
                    max = pow_value[i][j];
                    max_a = number[i];
                    max_b = number[j];
                }

                if (pow_value[i][j] < min) {
                    min = pow_value[i][j];
                    min_a = number[i];
                    min_b = number[j];
                }
            }
        }

        System.out.printf("Max number is %d which is %d squared of %d\n", max, max_a, max_b);
        System.out.printf("Min number is %d which is %d squared of %d\n", min, min_a, min_b);
    }
}

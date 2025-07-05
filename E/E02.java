import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height; // 입력받은 높이
        int blank; // 입력받은 여백 크기
        int i, j; // 반복문 사용을 위한 변수

        height = sc.nextInt();
        blank = sc.nextInt();
        for(i = 1; i <= height; i++){
            for (j = 0; j < blank + height - i ; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

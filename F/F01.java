import java.util.Scanner;

public class F01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10]; // 10개의 숫자를 담을 리스트
        int first; // 첫 번째로 큰 수
        int second; // 두 번째로 큰 수
        int second_max_index; // 두 번째로 큰 수의 인덱스
        int newnum; // 숫자 입력을 위한 변수
        int i; // 반복문을 위한 변수

        for (i = 0; i < 10; i++) {
            System.out.printf("Enter %dth number > ", i + 1);
            newnum = sc.nextInt();
            num[i] = newnum;

            if (newnum > first) {
                second = first;
                first = newnum;
            } 
            else if (newnum > second && newnum < first) {
                second = newnum;
            }
        }

        for (i = 0; i < 10; i++) {
            if (num[i] == second) {
                second_max_index = i;
                break;
            }
        }

        System.out.printf("Second largest number is %dth number %d\n", second_max_index + 1, second);
    }
}

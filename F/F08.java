import java.util.Scanner;

public class F08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number[] = new int[10];// 사용자가 입력한 숫자 10개
        int newnum; // 입력받은 숫자
        int count; // 현재까지 입력된 숫자의 개수(0~10)
        boolean dup; // 중복검사 통과 여부 (true : 중복, false : 중복없음)
        int i; // 반복문을 위한 변수

        System.out.println("Enter a number from 1 to 100");

        while (count < 10) {
            System.out.printf("Enter %dth number > ", count + 1);
            newnum = sc.nextInt();

            dup = false;
            for (i = 0; i < count; i++) {
                if (number[i] == newnum) {
                    dup = true;
                    break;
                }
            }

            if (dup || newnum < 1 || newnum > 100) { //1 - 100이 아닐때
                System.out.println("Invalid input!"); 
                continue;
            }

            number[count] = newnum;
            count++;
        }

        for (i = 0; i < 10; i++) {
            System.out.printf("%dth number is %d\n", i + 1, number[i]);
        }

    }
}

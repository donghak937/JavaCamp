import java.util.Scanner;
import java.util.Random;

public class H05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int coins;                      // 사용자의 코인 수. (최초에 입력받음)
        int[] number = new int[3];      // 랜덤하게 만들어진 슬롯 머신의 숫자 3개의 리스트
        int i = 1;                      // 반복문을 위한 변수

        System.out.print("Enter number of coins > ");
        coins = sc.nextInt();
        sc.nextLine();

        while (coins > 0) {
            System.out.printf("Start %dth game!!! (Press Enter to start) > ", i++);
            sc.nextLine();

            for (int j = 0; j < 3; j++) {
                number[j] = rand.nextInt(9) + 1;
            }

            System.out.printf("Result of game : %d %d %d ---> ", number[0], number[1], number[2]);

            if (number[0] == number[1] && number[1] == number[2]) {
                coins += 3;
                System.out.println("match 3 numbers! got four more coins");
            } else if (number[0] == number[1] || number[0] == number[2] || number[1] == number[2]) {
                coins += 1;
                System.out.println("match 2 numbers! got two more coins");
            } 
            else System.out.println("Failed...");
            

            coins--;
            System.out.printf("There are %d coins remaining.\n\n", coins);
        }

        System.out.println("Game over!");
    }
}

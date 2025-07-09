import java.util.Scanner;
import java.util.Random;

public class H04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int com_finger; // 컴퓨터가 낸 가위(1), 바위(2), 보(3)
        int my_finger; //사용자가 낸 가위(1), 바위(2), 보(3)
        int score[][] = new int[2][3];//결과 횟수 리스트 [[컴퓨터의 승, 무, 패], [사용자의 승, 무, 패]]
        int i, j; // 반복문을 위한 변수

        String[] hands = {"", "Scissors", "Rock", "Paper"};

        while (true) {
            System.out.print("Enter Scissors(1) Rock(2) Paper(3) > ");
            my_finger = sc.nextInt();

            if (my_finger == 0) break;
            if (my_finger < 1 || my_finger > 3) {
                System.out.println("Invalid input!");
                continue;
            }

            com_finger = rand.nextInt(3) + 1;

            System.out.printf("What the computer has given out is %s ---> ", hands[com_finger]);

            if (my_finger == com_finger) {
                System.out.println("Draw!");
                score[0][1]++; //
                score[1][1]++; // 
            } 
            //비김
            else if ((my_finger == 1 && com_finger == 3) || (my_finger == 2 && com_finger == 1) || (my_finger == 3 && com_finger == 2)) {  
                System.out.println("You win!");
                score[1][0]++; 
                score[0][2]++; 
            }
            //사용자가 이기는 경우 
            else {
                System.out.println("Computer win..");
                score[0][0]++;
                score[1][2]++;
            }
            //아니면 지겠지 뭐
        }

        System.out.println();
        System.out.printf("Computer : win - %d, lost - %d, draw - %d\n",score[0][0], score[0][2], score[0][1]);
        System.out.printf("User : win - %d, lost - %d, draw - %d\n", score[1][0], score[1][2], score[1][1]);
    }
}

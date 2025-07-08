import java.util.Scanner;
import java.util.Random;

public class H01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int answer = rand.nextInt(100) + 1;
        int number_try;
        int count = 0;

        while (true) {
            System.out.print("Guess the number from 1 to 100 > ");
            number_try = sc.nextInt();
            count++;

            if (number_try > answer) System.out.println("Down!");
            else if (number_try < answer) System.out.println("Up!");
            else {
                System.out.printf("You figured out the number in %d times\n", count);
                break;
            }
        }
    }
}

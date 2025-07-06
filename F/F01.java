import java.util.Scanner;

public class F01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int second_max_index = -1;
        int newnum;
        int i;

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

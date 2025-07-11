import java.util.Scanner;

class Main {
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i05();
    }

    void i05() {
        System.out.println("Find the maximum of 10 numbers");
        int max = MaxOfTen();
        System.out.printf("\nMaximum value is %d\n", max);
    }

    int MaxOfTen() {
        int max = Integer.MIN_VALUE;
        int input;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter %dth number > ", i + 1);
            input = s.nextInt();

            if (input > max) max = input;
        }

        return max;
    }
}

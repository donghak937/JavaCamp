import java.util.Scanner;

public class J02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];
        double total = 0;
        double average = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter %dth score > ", i + 1);
            scores[i] = sc.nextDouble();
        }

        double max = Max(scores);
        double min = Min(scores);

        for (double score : scores) {
            total += score;
        }

        average = (total - max - min) / 8.0;
        System.out.printf("Average is %.1f\n", average);

    }

    public static double Max(double[] num) {
        double max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }

    public static double Min(double[] num) {
        double min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
}

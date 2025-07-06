import java.util.Scanner;

public class F02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] score = new double[10]; // 심사 점수 배열
        float maxscore, minscore;
        float total = 0;
        float average;
        float newnum;
        int i;

        // 입력과 동시에 최고점, 최저점 구하기
        System.out.printf("Enter 1th score > ");
        newnum = sc.nextFloat();
        score[0] = newnum;
        maxscore = newnum;
        minscore = newnum;
        total += newnum;

        for (i = 1; i < 10; i++) {
            System.out.printf("Enter %dth score > ", i + 1);
            newnum = sc.nextFloat();
            score[i] = newnum;
            total += newnum;

            if (newnum > maxscore) maxscore = newnum;
            if (newnum < minscore) minscore = newnum;
        }

        total = total - maxscore - minscore;
        average = total / 8;

        System.out.printf("Average is %.1f\n", average);
    }
}

import java.util.Scanner;

public class F02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score[] = new double[10]; // 심사점수 리스트
        float maxscore, minscore; // 가장 큰 점수, 가장 작은 점수
        float total; // 점수 총 합계
        float average; // 평균점수
        float newnum; // 숫자 입력을 위한 변수
        int i; // 반복문을 위한 변수

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

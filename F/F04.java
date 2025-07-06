import java.util.Scanner;

public class F04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트
        int sum[] = new int[5]; // 각 학생의 총점 리스트
        double average[] = new double[5]; // 각 학생의 평균 리스트
        int kor, eng, mat; // 3과목 점수 입력을 위한 변수
        int i, j; // 반복문을 위한 변수

        for (i = 0; i < 5; i++) {
            System.out.printf("Enter Korean, English, Math score of %dth student > ", i + 1);
            kor = sc.nextInt();
            eng = sc.nextInt();
            mat = sc.nextInt();

            jumsu[i][0] = kor;
            jumsu[i][1] = eng;
            jumsu[i][2] = mat;
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 3; j++) {
                sum[i] += jumsu[i][j];
            }
            average[i] = (double)sum[i] / 3;
        }

        for (i = 0; i < 5; i++) {
            System.out.printf("Total score of %dth student is %d, average is %.1f\n", i + 1, sum[i], average[i]);
        }

    }
}

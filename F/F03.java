import java.util.Scanner;

public class F03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트
        int sum[] = new int[3]; // 3과목 총점 리스트
        double average[] = new double[3]; // 3과목 평균 리스트
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

        for (j = 0; j < 3; j++) {
            for (i = 0; i < 5; i++) {
                sum[j] += jumsu[i][j];
            }
        }

        for (j = 0; j < 3; j++) {
            average[j] = (double)sum[j] / 5;
        }

        System.out.printf("Total Korean score is %d, average is %.1f\n", sum[0], average[0]);
        System.out.printf("Total English score is %d, average is %.1f\n", sum[1], average[1]);
        System.out.printf("Total Math score is %d, average is %.1f\n", sum[2], average[2]);
    }
}

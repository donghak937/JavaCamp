import java.util.Scanner;

public class F05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height, weight; // 입력받은 신장(cm), 체중(kg)
        float bmi; // 계산된 비만도 수치
        float bmilist[][] = new float[10][3]; // 10명에 대한 신장, 체중, 비만도수치를 담고 있는 리스트
        int count; // 비만인 사람의 숫자
        int i; // 반복문을 위한 변수

        for (i = 0; i < 10; i++) {
            System.out.printf("Enter height(cm) and weight(kg) > ");
            height = sc.nextInt();
            weight = sc.nextInt();

            bmi = (float)(weight / ((height / 100.0) * (height / 100.0)));

            bmilist[i][0] = height;
            bmilist[i][1] = weight;
            bmilist[i][2] = bmi;
        }

        for (i = 0; i < 10; i++) {
            if (bmilist[i][2] >= 25.0) {
                System.out.printf("%dth person is obesity\n", i + 1);
                count++;
            }
        }

        System.out.printf("%d people is obesity\n", count);
    }
}

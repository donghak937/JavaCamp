import java.util.Scanner;

public class G02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input_degree; // 입력받은 온도
        double[] degrees = new double[10]; // 온도 리스트
        String[] degree_name = {"냉수", "미온수", "온수", "끓는물"};
        int[] count = {0,0,0,0}; // 입력 횟수 목록 (순서대로 냉수 입력 횟수, 미온수 입력 횟수, 온수 입력 횟수, 끓는 물 입력 횟수)
        int i; // 반복문을 위한 변수
        int sel; // 온도 판정 번호 (0,1,2,3)

        for (i = 0; i < 10; i++) {
            System.out.print("Enter water temperature > ");
            input_degree = sc.nextInt();

            if (input_degree < 0) {
                System.out.println("Invalid input!");
                i--;
                continue;
            }

            degrees[i] = input_degree;

            if (input_degree < 25) sel = 0;
            else if (input_degree < 40) sel = 1;
            else if (input_degree < 80) sel = 2;
            else sel = 3;

            count[sel]++;
        }

        System.out.println();

        for (i = 0; i < 10; i++) {

            System.out.printf("%dth water temperature is %.1f ", i + 1, degrees[i]);

            if (degrees[i] < 25) System.out.println(degree_name[0]);
            else if (degrees[i] < 40) System.out.println(degree_name[1]);
            else if (degrees[i] < 80) System.out.println(degree_name[2]);
            else System.out.println(degree_name[3]);
        }

        System.out.println();
        System.out.printf("Count of cold water is %d\n", count[0]);
        System.out.printf("Count of warm water is %d\n", count[1]);
        System.out.printf("Count of hot water is %d\n", count[2]);
        System.out.printf("Count of boiling water is %d\n", count[3]);
        //인코딩 이슈로 한글 안나옴

    }
}

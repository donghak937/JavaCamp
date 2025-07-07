import java.util.Scanner;

public class G01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int birth_year; // 입력받은 태어난 년도
        int[] age = new int[100]; // 각 사람들의 나이 (최대 100명)
        int count_person = 0; // 입력된 인원 수 
        int count_baby = 0; // 유아 수
        int count_child = 0; // 어린이 수
        int count_youth = 0; // 청소년 수
        int count_young = 0; // 청년 수
        int count_adult = 0; // 중년 수
        int count_old = 0; // 노년 수
        int i ; // 반복문을 위한 변수

        for (i = 0; i < 100; i++) {
            System.out.printf("Enter a birth year of %dth person > ", i + 1);
            birth_year = sc.nextInt();

            if (birth_year > 2021) break;

            age[i] = 2021 - birth_year + 1; //문제 양식에 맞춤
            count_person++;
        }

        System.out.println();

        for (i = 0; i < count_person; i++) {
            System.out.printf("%dth person are %d years old.\n", i + 1, age[i]);

            if (age[i] < 7) count_baby++;
            else if (age[i] < 13) count_child++;
            else if (age[i] < 20) count_youth++;
            else if (age[i] < 30) count_young++;
            else if (age[i] < 60) count_adult++;
            else count_old++;
        }

        System.out.println();
        System.out.printf("There are %d babys.\n", count_baby);
        System.out.printf("There are %d childs.\n", count_child);
        System.out.printf("There are %d youths.\n", count_youth);
        System.out.printf("There are %d youngs.\n", count_young);
        System.out.printf("There are %d adults.\n", count_adult);
        System.out.printf("There are %d olds.\n", count_old);

    }
}

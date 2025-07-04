import java.util.Scanner;

public class D04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count_all;      // 가족 수
        int count_young = 0; // 미성년자 수
        int birth_year;
        int age;

        System.out.print("Enter number of family members > ");
        count_all = sc.nextInt();

        for (int i = 0; i < count_all; i++) {
            System.out.printf("Enter a birth year > ");
            birth_year = sc.nextInt();
            age = 2021 - birth_year + 1;
            if (age < 20) count_young++;
        }

        System.out.println("There are " + count_young + " youngs in the family.");

    }
}

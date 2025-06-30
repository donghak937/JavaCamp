import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birth_year ; // 태어난 년도
        int age ; // 나이
        System.out.printf("Enter a birth year > ");
        birth_year = sc.nextInt();
        age = 2025 - birth_year;
        System.out.printf("You are %d year's old.", age);
    }
}
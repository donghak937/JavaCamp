import java.util.Scanner;

public class B01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birth_year ; // 태어난 년도
        int age ; // 나이
        System.out.printf("Enter a birth year > ");
        birth_year = sc.nextInt();
        age = 2024 - birth_year + 1;
        if (age > 20) System.out.println("You are an adult");
        else System.out.println("You are a minor");
    }
}
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birth_year ; // 태어난 년도
        int age ; // 나이
        System.out.printf("Enter a birth year > ");
        birth_year = sc.nextInt();
        age = 2023 - birth_year + 1;
        if (age < 7) System.out.println("You are baby"); 
        else if (age < 13) System.out.println("You are child");
        else if (age < 20) System.out.println("You are teenage");
        else if (age < 30) System.out.println("You are youth");
        else if (age < 60) System.out.println("You are middle-age");
        else System.out.println("You are old age");
        
    }
}
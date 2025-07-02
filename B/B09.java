import java.util.Scanner;

public class B09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, weight; // 신장(cm), 체중(kg)
        int bmi; // 비만도 수치
        System.out.printf("Enter height(cm) ");
        height = sc.nextInt();
        System.out.printf("Enter weight(kg) ");
        weight = sc.nextInt();
        bmi = (int) (weight / ((height*0.01) * (height * 0.01)));
        if (bmi >= 25) System.out.println("You are obesity");
        else System.out.println("You are not obesity");
    }
}
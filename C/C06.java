import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kor, eng, math; // 국어점수, 영어점수, 수학점수
        int total; // 총점
        double average; // 평균점수

        System.out.print("Enter points of Korean > ");
        kor = sc.nextInt();

        System.out.print("Enter points of English > ");
        eng = sc.nextInt();

        System.out.print("Enter points of Math > ");
        math = sc.nextInt();

        total = kor + eng + math;
        average = total / 3.0;

        System.out.println("Total point is " + total);
        System.out.printf("The average is %.1f\n", average);

        if (average >= 90) System.out.println("Your grade is A");
        else if (average >= 80) System.out.println("Your grade is B");
        else if (average >= 70) System.out.println("Your grade is C");
        else if (average >= 60) System.out.println("Your grade is D");
        else System.out.println("Your grade is F");

    }
}

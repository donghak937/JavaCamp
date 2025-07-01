import java.util.Scanner;

public class B06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor; // 국어점수
        int eng; // 영어점수
        int math; // 수학점수
        int total; // 총점
        double average; // 평균점수
        
        System.out.printf("Enter points of Korean > ");
        kor = sc.nextInt();
        System.out.printf("Enter points of English > ");
        eng = sc.nextInt();
        System.out.printf("Enter points of Math > ");
        math = sc.nextInt();

        total = kor + eng + math;
        average = (double)total / 3;

        System.out.printf("Total point is %d\n", total);
        System.out.printf("The average is %.1f\n", average);

        if(kor >= 90) System.out.println("Korean grade is outstanding!");
        if(eng >= 90) System.out.println("English grade is outstanding!");
        if(math >= 90) System.out.println("Math grade is outstanding!");

    }
}

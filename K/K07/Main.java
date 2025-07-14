import java.util.Scanner;
import java.util.ArrayList;

class Main {

    Scanner key = new Scanner(System.in);
    ArrayList<Student> arr = new ArrayList<Student>();

    public static void main(String[] args) {
        Main stepK = new Main();
        stepK.k07();
    }

    void k07() {
        System.out.print("Enter a number of students > ");
        int count = key.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.printf("Enter score of korean, english, math of %dth student > ", i + 1);
            input();
        }

        System.out.println("================================================");
        System.out.printf("Registered %d students list are as follows\n", count);
        System.out.println("------------------------------------------------");
        System.out.printf("%-5s %-7s %-7s %-7s %-7s %-8s %-5s\n", 
                          "num", "Korean", "English", "Math", "Total", "Average", "Grade");

        for (int i = 0; i < arr.size(); i++) {
            print(i + 1, arr.get(i));
        }
    }

    // 입력받는 메소드
    public void input() {
        int korean = key.nextInt();
        int english = key.nextInt();
        int math = key.nextInt();

        Student s = new Student();
        s.korean = korean;
        s.english = english;
        s.math = math;
        s.total = korean + english + math;
        s.average = s.total / 3.0;

        if (s.average >= 95) s.grade = "A+";
        else if (s.average >= 90) s.grade = "A";
        else if (s.average >= 85) s.grade = "B+";
        else if (s.average >= 80) s.grade = "B";
        else if (s.average >= 75) s.grade = "C+";
        else if (s.average >= 70) s.grade = "C";
        else if (s.average >= 65) s.grade = "D+";
        else if (s.average >= 60) s.grade = "D";
        else s.grade = "F";

        arr.add(s);
    }
    // 출력하는 메소드
    public void print(int index, Student s) {
        System.out.printf("%-5d %-7d %-7d %-7d %-7d %-8.1f %-5s\n",index, s.korean, s.english, s.math, s.total, s.average, s.grade);
    }

    class Student {
        int korean, english, math, total;
        double average;
        String grade;
    }
}

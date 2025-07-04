import java.util.Scanner;

public class D06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m2_area;       // 제곱미터 면적
        double pyung_area;    // 평수

        int count1 = 0; // 소형
        int count2 = 0; // 중소형
        int count3 = 0; // 중형
        int count4 = 0; // 대형
        int i;

        for (i = 0; i < 10; i++) {
            System.out.print("Enter area of Apartment(m^2) > ");
            m2_area = sc.nextDouble();

            pyung_area = m2_area / 3.305;
            System.out.printf("Area of Apartment(pyung) %.1f\n", pyung_area);

            if (pyung_area < 15) count1++;
            else if (pyung_area < 30) count2++;
            else if (pyung_area < 50) count3++;
            else count4++;
        }

        System.out.println("Count of small-sized apartment is " + count1);
        System.out.println("Count of small and medium-sized apartment is " + (count1 + count2));
        System.out.println("Count of medium-sized apartment is " + count3);
        System.out.println("Count of big-sized apartment is " + count4);

    }
}

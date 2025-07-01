import java.util.Scanner;

public class B04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m2_area; // 면적 (제곱미터)
        double pyung_area; // 면적 (평수)  
        System.out.printf("Enter area of Apartment(m^2) > ");
        m2_area = sc.nextDouble();

        pyung_area = m2_area / 3.305;
        System.out.printf("Area of Apartment(평수) %.1f\n", pyung_area);
        if (pyung_area >= 30) System.out.println("It is a big apartment");
        else System.out.println("It is a small apartment");
    }
}

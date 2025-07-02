import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m2_area; // 면적 (제곱미터)
        double pyung_area; // 면적 (평수)

        System.out.print("Enter area of Apartment(m^2) > ");
        m2_area = scanner.nextDouble();

        pyung_area = m2_area / 3.3058;

        System.out.printf("Area of Apartment(pyung) %.1f\n", pyung_area);

        if (pyung_area < 15) System.out.println("It is small-sized apartment.");
        else if (pyung_area < 30) System.out.println("It is small and medium-sized apartment.");
        else if (pyung_area < 50) System.out.println("It is medium-sized apartment.");
        else System.out.println("It is big-sized apartment.");

        scanner.close();
    }
}

import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c_degree; //섭씨 온도
        double f_degree; //화씨 온도    
        System.out.printf("Enter Celsius temperature > ");
        c_degree = sc.nextDouble();
        f_degree = c_degree * 1.8 + 32;
        System.out.printf("Fahrenheit temperature is %.1f", f_degree);
    }
}

import java.util.Scanner;

public class B02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input_degree; // 입력받은 온도
        String kind; // 온도의 종류, 섭씨온도이면 'C', 화씨온도이면 'F'
        double output_degree; // 변환한 온도  
        System.out.printf("Enter temperature > ");
        input_degree = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Enter type of temperature('C' for Celsius, 'F' for Fahrenheit) ");
        kind = sc.nextLine();
        if (kind.equals("C")){
            output_degree = input_degree * 1.8 + 32;
            System.out.printf("Fahrenheit temperature is %.1f", output_degree);
        } 
        else {
            output_degree = (input_degree - 32)/1.8;
            System.out.printf("Celsius temperature is %.1f", output_degree);
        }
    }
}

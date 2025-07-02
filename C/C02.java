import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input_degree; // 입력받은 온도
        System.out.printf("Enter water temperature > ");
        input_degree = sc.nextDouble();

        if (input_degree < 0) System.out.println("Invalid input!");
        else if (input_degree < 25) System.out.println("It's cold water");
        else if (input_degree < 40) System.out.println("It's warm water");
        else if (input_degree < 80) System.out.println("It's hot water");
        else System.out.println("It's boiling water");
        
    }
}

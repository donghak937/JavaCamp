import java.util.Scanner;

public class J03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temps = new double[10];
        int[] count = new int[4];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter %dth water temperature > ", i + 1);
            temps[i] = sc.nextDouble();

            int type = AskWater(temps[i]);
            count[type]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%dth water temperature is %.1f ", i + 1, temps[i]);
            int type = AskWater(temps[i]);
            if (type == 0) System.out.println("cold water");
            else if (type == 1) System.out.println("warm water");
            else if (type == 2) System.out.println("hot water");
            else  System.out.println("boiling water");
        }

        System.out.printf("Count of cold water is %d\n", count[0]);
        System.out.printf("Count of warm water is %d\n", count[1]);
        System.out.printf("Count of hot water is %d\n", count[2]);
        System.out.printf("Count of boiling water is %d\n", count[3]);

    }

    public static int AskWater(double degree) {
        if (degree < 25.0) return 0;         
        else if (degree < 40.0) return 1;    
        else if (degree < 80.0) return 2;    
        else return 3;                       
    }
}

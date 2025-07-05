import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;

        System.out.print("Enter a length of rectangle > ");
        length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf("# ");
            }
            System.out.println();
        }
    }
}

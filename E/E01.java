import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        int i, j;

        System.out.print("Enter a length of rectangle > ");
        length = sc.nextInt();

        for (i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                System.out.printf("# ");
            }
            System.out.println();
        }
    }
}

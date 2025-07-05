import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height; 
        int i, j; 
        System.out.print("Enter a height of triangle > ");
        height = sc.nextInt();
        for(i = 1; i <= height; i++){
            for (j = 0; j < height - i ; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width, height; // 가로크기, 세로크기

        System.out.print("Enter width of Rectangle > ");
        width = scanner.nextInt();

        System.out.print("Enter height of Rectangle > ");
        height = scanner.nextInt();

        if (width == height) System.out.println("It is a square.");
        else if (width >= 2 * height) System.out.println("It is an oblong rectangle from side to side.");
        else if (height >= 2 * width) System.out.println("It is an oblong rectangle from top to bottom.");
        else if (width > height) System.out.println("It is a horizontal rectangle.");
        else System.out.println("It is a vertical rectangle.");

    }
}

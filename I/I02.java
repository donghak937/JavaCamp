import java.util.Scanner;

class I02 {
    public static void main(String[] args) {
        I02 stepI = new I02();
        stepI.i02();
    }

    void i02() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a character to draw triangle > ");
        char ch = s.next().charAt(0);

        System.out.print("Enter a height of right triangle and blank > ");
        int height = s.nextInt();
        int blank = s.nextInt();

        for (int i = 1; i <= height; i++) {
            PrintCharWithBlank(blank + height - i, i, ch);
        }
    }

    void PrintCharWithBlank(int blanks, int size, char ch) {
        for (int i = 0; i < blanks; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < size; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

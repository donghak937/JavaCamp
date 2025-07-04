import java.util.Scanner;

public class D05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width, height; // 가로크기, 세로크기
        int count1 = 0; // "정사각형"의 개수
        int count2 = 0; // "좌우로 길쭉한 직사각형"의 개수
        int count3 = 0; // "위아래로 길쭉한 직사각형"의 개수
        int count4 = 0; // "일반적인 가로형 직사각형"의 개수
        int count5 = 0; // "일반적인 세로형 직사각형"의 개수

        while (true) {
            System.out.printf("Enter width, height of Rectangle > ");
            width = sc.nextInt();
            height = sc.nextInt();

            if (width <= 0 || height <= 0)
                break;

            if (width == height) count1++;
            else if (width >= 2 * height) count2++;
            else if (height >= 2 * width) count3++;
            else if (width > height) count4++;
            else if (height > width) count5++;
        }

        System.out.println("Count of square is " + count1);
        System.out.println("Count of an oblong rectangle from side to side is " + count2);
        System.out.println("Count of an oblong rectangle from top to bottom is " + count3);
        System.out.println("Count of a horizontal rectangle is " + count4);
        System.out.println("Count of a vertical rectangle is " + count5);

    }
}

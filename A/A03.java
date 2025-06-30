import java.util.Scanner;

public class A03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width; // 가로크기
        int height; // 세로크기
        int area; // 직사각형의 넓이  
        System.out.printf("Enter width of Rectangle > ");
        width = sc.nextInt();
        System.out.printf("Enter height of Rectangle > ");
        height = sc.nextInt();
        area = width * height;
        System.out.printf("Area of Rectangle is %d", area);
    }
}

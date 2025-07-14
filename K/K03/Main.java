import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coordinate (X, Y) > ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        Point p = new Point(x, y);
        int area = p.get_area(x, y);

        System.out.println("================================================");

        String quadrantName = "";
        if (area == 1) quadrantName = "first";
        else if (area == 2) quadrantName = "second";
        else if (area == 3) quadrantName = "third";
        else if (area == 4) quadrantName = "fourth";
        else quadrantName = "axis";

        if (area == 0) System.out.println("Coordinate is located on the axis");
        else System.out.println("Coordinate is located on " + quadrantName + " quadrants");

        for (int i = 1; i <= 4; i++) {
            if (area == i) System.out.printf("Number of coordinates on %dth quadrants is 1\n", i);
            else System.out.printf("Number of coordinates on %dth quadrants is 0\n", i);
        }
    }
}

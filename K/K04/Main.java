import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of coordinate > ");
        int count = sc.nextInt();

        Point[] points = new Point[count];
        int[] quadrantCounts = new int[5];
        for (int i = 0; i < count; i++) {
            System.out.printf("Enter %dth coordinate (X, Y) > ", i + 1);
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            points[i] = new Point(x, y);
            int area = points[i].get_area(x, y);

            if (area != 0) quadrantCounts[area]++;
        }

        System.out.println("================================================");

        for (int i = 0; i < count; i++) {
            int area = points[i].get_area(points[i].x, points[i].y);

            String quadrantName = "";

            if (area == 1) quadrantName = "first";
            else if (area == 2) quadrantName = "second";
            else if (area == 3) quadrantName = "third";
            else if (area == 4) quadrantName = "fourth";
            else quadrantName = "axis";

            if (area == 0) System.out.printf("%dth coordinate is located on the axis\n", i + 1);
            else System.out.printf("%dth coordinate is located on %s quadrants\n", i + 1, quadrantName);
            
        }

        System.out.println();

        for (int i = 1; i <= 4; i++) {
            System.out.printf("Number of coordinates on %dth quadrants is %d\n", i, quadrantCounts[i]);
        }

    }
}

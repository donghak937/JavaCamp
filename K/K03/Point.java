public class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int get_area(double x, double y) {
        if (x == 0 || y == 0) return 0;
        else if (x > 0 && y > 0) return 1;
        else if (x < 0 && y > 0) return 2;
        else if (x < 0 && y < 0) return 3;
        else return 4;
    }
}

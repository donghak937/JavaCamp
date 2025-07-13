public class J10 {

    public static void main(String[] args) {
        int n = 2;
        double ratio = 0;
        double prev = 0;

        while (true) {
            int a = fibonacci(n);

            int b = fibonacci(n + 1);

            ratio = (double)b / a;

            System.out.printf("%dth ratio (%d / %d) : %.6f\n", n, b, a, ratio);

            if (Math.abs(ratio - prev) < 0.000001) break;
            prev = ratio;
            n++;
        }
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

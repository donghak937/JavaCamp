public class J06 {

    public static void main(String[] args) {
        System.out.println("Fibonacci numbers from 1 to 20 are as follows.");

        for (int i = 1; i <= 20; i++) {

            String a;
            if (i % 100 >= 11 && i % 100 <= 13) a = "th";
            else if (i % 10 == 1) a = "st";
            else if (i % 10 == 2) a = "nd";
            else if (i % 10 == 3) a = "rd";
            else a = "th";

            System.out.printf("%d%s : %d\n", i, a, fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

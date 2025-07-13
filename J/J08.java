public class J08 {

    public static void main(String[] args) {
        System.out.println("Ackermannonacci numbers from 1 to 20 are as follows.");

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int result = Ackermann(i, j);
                System.out.printf("Ackermann(%d, %d) = %d\n", i, j, result);
            }
        }
    }

    public static int Ackermann(int i, int j) {
        if (i == 0) return j + 1;
        else if (j == 0) return Ackermann(i - 1, 1);
        else return Ackermann(i - 1, Ackermann(i, j - 1));
    }
}

import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i06();
    }

    void i06() {
        int big = 0;
        int normal = 0;
        int small = 0;

        System.out.println("Generating 10 numbers...");

        for (int i = 0; i < 10; i++) {
            byte result = GetRandom();

            if (result == 1) big++;
            else if (result == 2) normal++;
            else if (result == 3) small++;
        }

        System.out.println();
        System.out.printf("1. Big (>= 70) : %d\n", big);
        System.out.printf("2. Normal (>= 40) : %d\n", normal);
        System.out.printf("3. Small (< 40) : %d\n", small);
    }

    byte GetRandom() {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;

        System.out.printf("Generated random number is %d\n", num);

        if (num >= 70) return 1;
        else if (num >= 40) return 2;
        else return 3;
    }
}

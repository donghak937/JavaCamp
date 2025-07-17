import java.util.Scanner;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n05();
    }

    void n05() {
        Scanner s = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        int num = Integer.MAX_VALUE;
        System.out.println("Input: ");
        while (true) {
            num = s.nextInt();
            if (num < 0) break;
            v.add(num);
        }

        for (int n : v) {
            System.out.print((char)n);
        }
        
    }
}
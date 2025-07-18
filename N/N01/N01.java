import java.util.Scanner;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n01();
    }

    void n01() {
        Scanner s = new Scanner(System.in);
        HashSet intSet = new HashSet<Integer>();
        int num = Integer.MAX_VALUE;
        System.out.println("input");
        while (true) {
            num = s.nextInt();
            if (num < 0) break;
            intSet.add(num);
        }

        intSet.remove(1);
        List<Integer> list = new ArrayList<>(intSet);
        Collections.sort(list);

        System.out.println("\noutput");
        for (int n : list) {
            System.out.print(n + " ");
        }
    }
}
import java.util.Scanner;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n04();
    }

    void n04() {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int num = Integer.MAX_VALUE;
        System.out.println("input");
        while (true) {
            num = s.nextInt();
            if (num < 0) break;
            ll.add(num);
        }
        System.out.println("Output: ");
        while (true) {
            System.out.print(ll.getFirst() + " ");
            ll.removeFirst();
            if (ll.isEmpty()) break;
            System.out.print(ll.getLast() + " ");
            ll.removeLast();
            if (ll.isEmpty()) break;
        }
    }
}
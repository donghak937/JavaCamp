import java.util.Scanner;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n07();
    }

    void n07() {
        LinkedList<Character> ll = new LinkedList<>();
        Scanner s = new Scanner(System.in); 

        System.out.println("Input:");
        String input = s.nextLine();

        for (char c : input.toCharArray()) {
            ll.add(c);
        }

        boolean isPalindrome = true;
        while (ll.size() > 1) {
            if (!ll.getFirst().equals(ll.getLast())) {
                isPalindrome = false;
                break;
            }
            ll.removeFirst();
            ll.removeLast();
        }

        if (isPalindrome)  System.out.println(input);
        else System.out.println("It is not Palindrome!");
    }
}

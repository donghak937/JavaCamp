import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n06();
    }

    void n06() {
        Stack<Character> st = new Stack<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Input: "); 
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        System.out.println("output: "); 
        while (!st.empty()) {
            System.out.print(st.pop());
        }
    }
}
import java.util.Scanner;

public class H07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("=======================");
        while (true) {
            System.out.print("=> Enter a sentence ('x' for exit) > ");
            a = sc.nextLine();
            if (a.equalsIgnoreCase("x")) break;
            System.out.println("=> Number of character is " + a.length());
            for(int i = 0; i <a.length(); i++){
                System.out.println("=> " +  a.charAt(i));
            }
            System.out.println("=======================");
        }
        System.out.println("Exit program");
    }
}

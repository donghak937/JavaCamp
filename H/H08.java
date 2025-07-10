import java.util.Scanner;

public class H08 {
    public static void main(String[] args) {
        String input; // 입력받는 문자열
        String findStr; // 찾을 문자열
        String replaceStr; // 바꾸고자 하는 문자열
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("=======================");
            System.out.print("=> Enter a sentence ('x' for exit) > ");
            input = sc.nextLine();
            if(input.equalsIgnoreCase("x")) break;
            System.out.print("=> Enter a sentence to find > ");
            findStr = sc.nextLine();
            System.out.print("=> Enter a sentence to replace > ");
            replaceStr = sc.nextLine();
            
            String str = input.replaceAll(findStr, "");
            count = (input.length() - str.length()) / findStr.length();

            System.out.printf("=> The replacement occurred %d times\n", count);
            System.out.println("=> " + input.replaceAll(findStr, replaceStr));
            
        }
                
    }
}

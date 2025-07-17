import java.util.Scanner;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n02();
    }

    void n02() {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> mountains = new HashMap<>();

        System.out.println("Input:");
        while (true) {
            String str = s.nextLine();
            if (str.equalsIgnoreCase("eof")) break;
            String[] mount = str.split(",");
            mountains.put(mount[0], mount[1]);
        }
        
        System.out.println("\nOutput:");
        for(String i : mountains.keySet()) { 
            System.out.println(i + " : " + mountains.get(i) + " m");
        }
    }
}
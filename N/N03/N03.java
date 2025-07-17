import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n03();
    }

    void n03() {
        Scanner s = new Scanner(System.in);
        TreeMap<String, Double> mountains = new TreeMap<>();

        System.out.println("Input:");
        while (true) {
            String str = s.nextLine();
            if (str.equalsIgnoreCase("eof")) break;
            String[] mount = str.split(",");
            mountains.put(mount[0], Double.parseDouble(mount[1]));
        }
        
        System.out.println("\nOutput:");
        for(String i : mountains.keySet()) { 
            System.out.println(i + " : " + mountains.get(i) + " m");
        }
    }
}
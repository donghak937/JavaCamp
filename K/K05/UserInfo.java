import java.util.Scanner;

public class UserInfo {
    String id;
    String password;

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id, password > ");
        id = sc.next();
        password = sc.next();
    }

    public void printall(int index) {
        System.out.printf("%-7d %-7s %-7s\n", index, id, password);
    }
}

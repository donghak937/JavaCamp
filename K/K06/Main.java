import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of students > ");
        int count = sc.nextInt();

        UserInfo[] users = new UserInfo[count];

        for (int i = 0; i < count; i++) {
            System.out.printf("Enter id, password of %dth student > ", i + 1);
            users[i] = new UserInfo();
            users[i].add();
        }

        System.out.println("================================================");
        System.out.printf("Registered %d students list are as follows\n", count);
        System.out.println("------------------------------------------------");
        System.out.printf("%-7s %-7s %-7s\n", "num", "name", "password");

        for (int i = 0; i < count; i++) {
            users[i].printall(i + 1);
        }
    }
}

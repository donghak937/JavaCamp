public class Main {
    public static void main(String[] args) {
        UserInfo user = new UserInfo();
        user.add();

        System.out.println("================================================");
        System.out.println("Registered students list are as follows");
        System.out.println("------------------------------------------------");
        System.out.printf("%-7s %-7s %-7s\n", "num", "name", "password");
        user.printall(1);
    }
}

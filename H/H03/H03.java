import java.util.Scanner;

public class H03 {
    private int[] lotto_user = new int[6]; // 사용자가 입력한 로또 번호 리스트
    private int[] lotto_com; // 컴퓨터가 만들어 낸 로또 번호 리스트
    private int match_count = 0; // 일치하는 로또 번호의 갯수 (0~6)

    public void run() {
        Scanner sc = new Scanner(System.in);
        int count = 0; // 현재 만들어지고 있는 로또 번호의 순서(0, 1, 2, 3, 4, 5)

        while (count < 6) {
            System.out.printf("Enter your %dth lotto number > ", count + 1);
            int num = sc.nextInt();

            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (lotto_user[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) System.out.println("Invalid input!");
            else {
                lotto_user[count] = num;
                count++;
            }
        }

        Lotto generator = new Lotto();
        lotto_com = generator.getNumbers();

        System.out.print("Lotto numbers of this week are ");
        for (int n : lotto_com) {
            System.out.print(n + " ");
        }
        System.out.println();

        checkMatch();
        System.out.printf("There are %d matching lotto numbers\n", match_count);
    }


    //포함 하는지 아닌지 
    private void checkMatch() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lotto_user[i] == lotto_com[j]) {
                    match_count++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        H03 app = new H03();
        app.run();
    }
}

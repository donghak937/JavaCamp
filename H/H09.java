import java.util.Scanner;

public class H09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input; // 입력받는 문자열(사람들 간은 ### 로 구분, 이름과 성별은 |로 구분)
        String userList[]; // 사용자 리스트
        String userInfo[]; // 한 사람의 정보
        int i, j; // 반복문에 사용되는 변수

        while (true) {
            System.out.println("===================================");
            System.out.print("Enter string ('x' for exit) > ");
            input = sc.nextLine();

            if (input.equals("x")) break;
            

            userList = input.split("###"); //한 번 나누어서 몇명인지 카운트 후에

            System.out.printf("Total number of people is %d\n", userList.length);

            for (i = 0; i < userList.length; i++) {
                userInfo = userList[i].split("\\|"); // 한 번 더 나누어서 넣어버리기
                System.out.printf("%d %s %s\n", i + 1, userInfo[0], userInfo[1]);
            }
        }
        System.out.println("Exit program");
    }
}

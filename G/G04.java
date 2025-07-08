import java.util.Scanner;
public class G04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kind; // 거래종류(1:매매, 2:임대, 0:계산종료)
        int money; // 거래금액
        int charge; // 중개 수수료
        int total_charge = 0; // 수수료 총액

        while (true){
            System.out.printf("Enter the type of real estate transaction(1:Trading, 2:Lease, 0:exit) > ");
            kind = sc.nextInt();

            if (kind == 0) break;

            System.out.printf("Enter the amount of real estate transaction. > ");
            money = sc.nextInt();

            if (kind == 1) {
                if (money < 50000000) {
                    charge = money * 6 / 1000;
                    if (charge > 250000) charge = 250000;
                } 
                else if (money < 200000000) {
                    charge = money * 5 / 1000;
                    if (charge > 800000) charge = 800000;
                } 
                else {
                    charge = money * 4 / 1000;
                }
            } else if (kind == 2) { // 
                if (money < 20000000) {
                    charge = money * 5 / 1000;
                    if (charge > 70000) charge = 70000;
                } 
                else if (money < 50000000) {
                    charge = money * 5 / 1000;
                    if (charge > 200000) charge = 200000;
                } 
                else if (money < 100000000) {
                    charge = money * 4 / 1000;
                    if (charge > 300000) charge = 300000;
                } 
                else {
                    charge = money * 3 / 1000;
                }
            } 
            else {
                System.out.println("Invalid transaction type.");
                continue;
            }

            System.out.printf("The charge is %d\n\n", charge);
            total_charge += charge;
        }

        System.out.printf("Total charge is %d\n", total_charge);
    }
}

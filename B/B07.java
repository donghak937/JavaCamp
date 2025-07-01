import java.util.Scanner;

public class B07 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int megabytes; // 용량(메가바이트 단위)
        long bytes; // 용량(바이트 단위)
        String usb2; // USB 2.0 사용여부 (Y: 예, N: 아니요)
        int time; // 전송시간(초 단위)
        
        System.out.printf("Enter file size as megabytes > ");
        megabytes = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter 'Y' if USB type is 2.0 or 'N' > ");
        usb2 = sc.nextLine();
        bytes = megabytes * 1024 * 1024;
        
        if (usb2.equals("Y")){
            time = (int) (bytes/ 60000000);
        } 
        else {
            time = (int) (bytes/1500000);
        }
        System.out.printf("File transfer time is %d", time);
    
    }
}

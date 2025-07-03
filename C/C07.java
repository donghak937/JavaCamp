import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int megabytes; // 용량(메가바이트 단위)
        long bytes; // 용량(바이트 단위)
        byte kind; // 전송방식 (1: Wi-Fi, 2: BlueTooth, 3: LTE, 4: USB)
        double time; // 전송시간(초 단위)

        System.out.print("Enter file size as megabytes > ");
        megabytes = sc.nextInt();

        System.out.print("Enter transfer method (1. WiFi, 2. Bluetooth, 3. LTE, 4. USB) > ");
        kind = sc.nextByte();

        bytes = (long) megabytes * 1024 * 1024;

        long speed = 0; // 전송 속도

        if (kind == 1) speed = 1500000;
        else if (kind == 2) speed = 300000;
        else if (kind == 3) speed = 1000000;
        else speed = 60000000;

        time = (double) bytes / speed;

        System.out.printf("File transfer time is %.1f\n", time);

        sc.close();
    }
}

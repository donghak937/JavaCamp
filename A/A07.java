import java.util.Scanner;

public class A07 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gigabytes; //용량(기가바이트 단위)
        int megabytes; // 용량(메가바이트 단위)
        int kilobytes; // 용량(킬로바이트 단위)
        long bytes; // 용량(바이트 단위)
        
        System.out.printf("Enter file size as gigabytes > ");
        gigabytes = sc.nextInt();
        megabytes = gigabytes * 1024;
        kilobytes = megabytes * 1024;
        bytes = (long)kilobytes * 1024;

        System.out.println("Your file size is ");
        System.out.println(megabytes + " MB");
        System.out.println(kilobytes + " KB");
        System.out.println(bytes + " B");

    }
}

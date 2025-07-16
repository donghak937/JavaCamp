import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Main stepM = new Main();
        stepM.m01();
    }

    void m01() {
        String filename = "out.txt";
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(filename);
            outputStream.println("Hello World!");
        } catch (FileNotFoundException e) {
            System.err.println("Error opening the file " + filename);
            System.exit(1);
        }
        // 쓰기
        outputStream.close();

        Scanner inputStream = null;
        try {
            inputStream = new Scanner(new File (filename));
            while(inputStream.hasNextLine()){
                String line = inputStream.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error opening the file " + filename);
            System.exit(1);
        }
        // 읽기
        inputStream.close();
    }
}
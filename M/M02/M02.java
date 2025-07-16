import java.util.Scanner;

import javax.sound.sampled.Line;

import java.io.*;

class Main {
    public static void main(String[] args) {
        Main stepM = new Main();
        stepM.m02();
    }

    void m02() {
        String filename = "out.txt";
        PrintWriter outputStream = null;
        Scanner sc = new Scanner(System.in);
        String lines = "";
        System.out.println("Enter a string and 'eof' to indicate the end of string.");
        try {
            outputStream = new PrintWriter(filename);
            while (true) {
                lines = sc.nextLine();
                if (lines.equalsIgnoreCase("eof")) break;
                outputStream.println(lines);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error opening the file " + filename);
            System.exit(1);
        }
        outputStream.close();
    }
}
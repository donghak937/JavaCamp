import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Main stepM = new Main();
        stepM.m03();
    }
    void createFile(String content) {
        String filename = "out.txt";
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream(filename, true));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening the file " + filename);
            System.exit(1);
        }
        outputStream.println(content);
        outputStream.close();
    }

    

    void m03() {
		createFile(
			"This is line 1\n" + "This is line 2");
        createFile(
			"This is line 3\n" + "This is line 4");
        String filename = "out.txt";
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
        inputStream.close();
	}
}
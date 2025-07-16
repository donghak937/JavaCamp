import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Main stepM = new Main();
        stepM.m05();
    }

    void m05() {
        String filename = "numbers.dat";
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));
            outputStream.writeUTF("One year is 365 days.");
            outputStream.writeUTF("One week is 7 days.");
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream inputStream =  new ObjectInputStream(new FileInputStream(filename));
            System.out.println(inputStream.readUTF());
            System.out.println(inputStream.readUTF());
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
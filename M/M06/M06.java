import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Main stepM = new Main();
        stepM.m06();
    }

    void m06() {
        String filename = "Fruits.dat";
        Fruit fruit1 =  new Fruit(1, "apple", 2000);
        Fruit fruit2 = new Fruit(2, "cherry", 4000);
        Fruit fruit3 = new Fruit(3, "melon", 5000);
        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(filename));

            outputStream.writeObject(fruit1);
            outputStream.writeObject(fruit2);
            outputStream.writeObject(fruit3);

            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectInputStream inputStream = null;
        Fruit readFruit1;
        Fruit readFruit2;
        Fruit readFruit3;

        try {
            inputStream = new ObjectInputStream(new FileInputStream(filename));
            // 읽기 
            readFruit1 = (Fruit) inputStream.readObject();
            readFruit2 = (Fruit) inputStream.readObject();
            readFruit3 = (Fruit) inputStream.readObject();

            System.out.println(readFruit1);
            System.out.println(readFruit2);
            System.out.println(readFruit3);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}

class Fruit implements Serializable
{
    private String name;
    private double price;
    private int id;

    public Fruit(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString()
    {
        return ("["+id+"]"+" "+name+" : "+price+" Won");
    }
}

import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Main stepM = new Main();
        stepM.m07();
    }

    void m07() {
        String filename = "FruitsArray.dat";

        Fruit[] fruits = new Fruit[3];
        fruits[0] = new Fruit(1,"Apple", 1000);
        fruits[1] = new Fruit(2,"Banana", 2000);
        fruits[2] = new Fruit(3,"Cherry", 3000);

        // 쓰기
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(filename));
            outputStream.writeObject(fruits);

            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 읽기
        Fruit[] readFruits = null;
        ObjectInputStream inputStream = null;
        try  {
            inputStream = new ObjectInputStream(new FileInputStream(filename));
            readFruits = (Fruit[]) inputStream.readObject();
            for(int i = 0; i < 3; i++){
                System.out.println(readFruits[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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

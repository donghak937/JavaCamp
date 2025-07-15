import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ParkingManager {
    Scanner sc = new Scanner(System.in);
    ArrayList<Car> cars = new ArrayList<>();
    int capacity;

    public ParkingManager(int capacity) {
        this.capacity = capacity;
    }

    public void enter() {
        if (cars.size() >= capacity) {
            System.out.println("Parking lot is full.");
            return;
        }
        System.out.print("Enter number, type > ");
        String number = sc.next();
        String type = sc.next();

        cars.add(new Car(number, type));
    }

    public void departure() {
        list();
        if (cars.isEmpty()) return;

        System.out.print("Enter number to departure > ");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < cars.size()) {
            Car car = cars.get(index);
            long fee = calculateFee(car.entryTime);
            System.out.println("Parking fee is " + fee + (fee == 0 ? " because current time is " + new Date() : ""));
            cars.remove(index);
        } 
        else System.out.println("Invalid number.");
    }

    private long calculateFee(String entryTime) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmm");
        Date entryDate = sdf.parse(entryTime);
        Date now = new Date();

        long diffMinutes = (now.getTime() - entryDate.getTime()) / (1000 * 60);
        if (diffMinutes <= 10) return 0;

        return ((diffMinutes - 10) / 10 + 1) * 500;

    }

    public void list() {
        System.out.println("================================================");
        System.out.printf("%-10s %-15s %-15s\n", "num", "type", "time");
        for (int i = 0; i < cars.size(); i++) {
            Car c = cars.get(i);
            System.out.printf("[%d] %-10s %-15s\n", i + 1, c.number, c.type + " " + c.entryTime);
        }
        System.out.println((capacity - cars.size()) + " parking lots available");
    }

    public void total() {
        System.out.println("Current number of car is " + cars.size());
    }

    public void remaining() {
        System.out.println((capacity - cars.size()) + " parking lots available");
    }
}

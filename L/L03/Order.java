import java.util.Date;

public class Order {
    int customerCount;
    int steakCount;
    int spaghettiCount;
    int pastaCount;
    boolean hasMembership;
    Date entryTime;

    public Order(int customerCount, int steakCount, int spaghettiCount, int pastaCount, boolean hasMembership) {
        this.customerCount = customerCount;
        this.steakCount = steakCount;
        this.spaghettiCount = spaghettiCount;
        this.pastaCount = pastaCount;
        this.hasMembership = hasMembership;
        this.entryTime = new Date();
    }
}

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Car {
    String number;
    String type;
    String entryTime;

    public Car(String number, String type) {
        this.number = number;
        this.type = type;
        this.entryTime = getCurrentTime();
    }

    private String getCurrentTime() {
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd HHmm", Locale.KOREA);
        return f.format(new Date());
    }
}

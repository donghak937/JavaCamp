import java.util.Random;

public class Lotto {
    private int[] numbers;

    public Lotto() {
        numbers = new int[6];
        generate();
    }

    private void generate() {
        Random rand = new Random();
        int count = 0;

        while (count < 6) {
            int num = rand.nextInt(45) + 1;
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) continue;
            else {
                numbers[count] = num;
                count++;
            }
        }
    }


    public int[] getNumbers() {
        return numbers;
    }
}

import java.util.Random;
import java.util.Scanner;

public class H02 {
    public static void main(String[] args){
        H02 h = new H02();
        h.Main();
    }

    void Main(){
        Scanner sc = new Scanner(System.in);
        Lotto a = new Lotto();
        String input;
        while (true) {
            System.out.print("The generated lotto numbers are ");
            a.printNumbers();
            System.out.print("Do you want to generate more lotto numbers? (Y/N) > ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("N")) break;
            a.remakeAuto();
            
        }
   }

}

class Lotto{
    int[] numbers;
    Random random = new Random();

    public Lotto(){ 
        this.numbers = new int[6];
        for(int i = 0; i < 6; i++){
            numbers[i] = random.nextInt(45) + 1;
            for(int j = 0; j < numbers.length; j++){
                if(i != j && numbers[i] == numbers[j]){
                    numbers[i] = random.nextInt(45) + 1;
                    i--;
                    break;
                }
            }
        }
    }

    public void remakeAuto(){
        for(int i = 0; i < 6; i++){
            numbers[i] = random.nextInt(45) + 1;
            for(int j = 0; j < 6; j++){
                if(i != j && numbers[i] == numbers[j]){
                    numbers[i] = random.nextInt(45) + 1;
                    i--;
                    break;
                }
            }
        }
    } 

    public void printNumbers(){ // 로또 출력
        for(int i = 0; i < 6; i++){
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
    }
}


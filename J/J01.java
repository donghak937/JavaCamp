import java.util.Scanner;

public class J01 {

    static int[] ageGroupCount = new int[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] birthYears = new int[100];
        int count = 0;

        while (count < 100) {
            System.out.printf("Enter a birth year of %dth person > ", count + 1);
            int birth = sc.nextInt();
            if (birth > 2021) break;

            birthYears[count] = birth;
            int group = AskAge(birth);
            ageGroupCount[group]++;
            count++;
        }

        System.out.println("There are " + ageGroupCount[0] + " babys.");
        System.out.println("There are " + ageGroupCount[1] + " childs.");
        System.out.println("There are " + ageGroupCount[2] + " youths.");
        System.out.println("There are " + ageGroupCount[3] + " youngs.");
        System.out.println("There are " + ageGroupCount[4] + " adults.");
        System.out.println("There are " + ageGroupCount[5] + " olds.");

        sc.close();
    }

    public static int AskAge(int birthyear) { //바로 사용가능하게 static
        int age = 2021 - birthyear + 1;
        System.out.println("This person is " + age + " years old.");

        if (age < 7) return 0;   
        else if (age < 13) return 1; 
        else if (age < 20) return 2; 
        else if (age < 30) return 3; 
        else if (age < 60) return 4;
        else return 5;               
    }
}

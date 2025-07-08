import java.util.Scanner;
import java.util.ArrayList;

public class G03Manager {

    ArrayList<G03Score> studentList = new ArrayList<G03Score>();

    public void makeStudent(int size){
        int kor, eng, mat;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++){
            System.out.printf("Enter Korean, English, Math score of %dth student > ", i+1);
            kor = sc.nextInt();
            eng = sc.nextInt();
            mat = sc.nextInt();

            G03Score student = new G03Score(kor, eng, mat, i+1);
            studentList.add(student);
        }
        System.out.println();
    }

    public void printTotal(){
        int ktotal = 0, etotal = 0, mtotal = 0;
        int size = studentList.size();
        System.out.println("1) Total score and average for each subjects");
        
        for(G03Score student : studentList) {	
            ktotal += student.getkor(); 
            etotal += student.geteng(); 
            mtotal += student.getmat(); 
        }
        System.out.printf("Total Korean score is %d, average is %.1f\n", ktotal, ktotal / (double)size);
        System.out.printf("Total English score is %d, average is %.1f\n", etotal, etotal / (double)size);
        System.out.printf("Total Math score is %d, average is %.1f\n", mtotal, mtotal / (double)size);
        System.out.println();
    }

    public void printStudent(){
        System.out.println("2) Total score and average for each students");
        
        for(G03Score student : studentList) {	
            System.out.println(student.toString());
        }
    }
}

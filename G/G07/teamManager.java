import java.util.ArrayList;
import java.util.Scanner;

public class teamManager {
    ArrayList<team> teamList = new ArrayList<team>();
    
    public void makeTeam(){
        Scanner sc = new Scanner(System.in);
        int team_count;
        int a[] = new int[4];
        int i, j;
        int card;
        System.out.print("Enter number of team > ");
        team_count = sc.nextInt();
        
        for(i = 0; i < team_count; i++){
            
            System.out.printf("\nEnter a number of %d th team member (child, youth, adult, old) > ", i + 1);

            for(j = 0; j < team_count; j++){
                a[j] = sc.nextInt();
            }

            System.out.printf("Enter a discount membership type of %d th team (no membership:0 , normal:1 , VIP:2) > ", i + 1);
            card = sc.nextInt();
            team group = new team(a[0], a[1], a[2], a[3], card);
            teamList.add(group);
            System.out.printf("Admission fees of %dth team is %d\n",i+1, group.getSum());
            
        }
    }

    public void totalPrint(){
        int c = 0, y = 0, adult = 0, old = 0;
        int total = 0;
        for(team a : teamList){
            c += a.getchild();
            y += a.getyouth();
            adult += a.getadult();
            old += a.getold();
            total += a.getSum();
        }

        System.out.println("Total number of visitors " + (c + y + adult + old));
        System.out.println("Total number of child " + c);
        System.out.println("Total number of youth " + y);
        System.out.println("Total number of adult " + adult);
        System.out.println("Total number of old " + old);
        
        System.out.println("\nTotal free is " + total);
    }


}

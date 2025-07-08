public class team {
    private int[] count; // 입력받은 연령별 인원 수
    private int membership ;
    private int sum; // 각 팀별 가격
    private int[] charge = {5000, 10000, 15000, 3000};
    private int total_people;

    public team(int child, int youth, int adult, int old, int card) {
        this.count = new int[4];
        this.membership  = card;
        
        count[0] = child;
        count[1] = youth;
        count[2] = adult;
        count[3] = old;
        total_people = child + youth + adult + old;
        sum = ((child * charge[0]) + (youth * charge[1]) + (adult * charge[2]) + (old * charge[3])) * (100 - membership * 10) / 100;

    }

    public int getSum(){
        return sum;
    }
    public int getTotal(){
        return total_people;
    }
    public int getchild(){
        return count[0];
    }
    public int getyouth(){
        return count[1];
    }
    public int getadult(){
        return count[2];
    }
    public int getold(){
        return count[3];
    }
}

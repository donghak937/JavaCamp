public class G03Score {
    private int kor, eng, mat; // 3과목 점수 입력을 위한 변수
    private int student_id;
    private int sum;
    private double average; 
    private char grade; 

    public G03Score(int kor, int eng, int mat, int student_id){
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.student_id = student_id;

        this.sum = kor + eng + mat;
        this.average = (double)sum / 3.0;

        setGrade(this.average);
    }

    private void setGrade(double score){
        if (average >= 90) this.grade = 'A';
        else if (average >= 80) this.grade = 'B';
        else if (average >= 70) this.grade = 'C';
        else if (average >= 60) this.grade = 'D';
        else  this.grade = 'F';
    }

    public int getkor() {
        return kor;
    }
    public int geteng() {
        return eng;
    }
    public int getmat() {
        return mat;
    }
    public int getStudentId() {
        return student_id;
    }
    public int getSum() {
        return sum;
    }
    public double getAverage() {
        return average;
    }
    public char getGrade() {
        return grade;
    }

    @Override
    public String toString(){
        return student_id + "th student score: Total - " + sum + ", average - " + (Math.round(average * 10) / 10.0) + ", grade - " + grade;
    }
    
}

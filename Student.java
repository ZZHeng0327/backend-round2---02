package round202;

public class Student
{   private String name;
    private String studentId;
    private int score;

    public Student(){}
    public Student(String name,String studentId,int score){
        this.name=name;
        this.studentId=studentId;
        this.score=score;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score>=0) {
            this.score = score;
        }
    }
    public void introduce(){
        System.out.println("我叫"+name+",学号"+studentId+",成绩"+score);
    }
}

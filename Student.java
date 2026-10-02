package round202;

public class Student {
    protected String name;
    protected String studentId;
    protected int score;
    Student[]arr;

   public Student (){}

    public Student(String name,String studentId,int score){
       this.name=name;
       this.studentId=studentId;
       this.score=score;
    }

    public Student(Student [] arr){
       this.arr=arr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentid() {
        return studentId;
    }

    public void setStudentid(String studentid) {
        this.studentId = studentid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score>=0){
            this.score = score;
        }
   }


    public void introduce(){
        for (int i = 0; i < arr.length; i++) {
            Student s=arr[i];
            System.out.println("我是"+ s.getName()+",学号"+s.getStudentid()+",成绩为"+s.getScore());
        }

    }
}


package round202;

public class GraduateStudent extends Student{
    private String advisor;
    public GraduateStudent(){}
    public GraduateStudent(String name,String studentId,int score,String advisor){
        super(name,studentId,score);
        this.advisor=advisor;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }
    @Override
    public void introduce(){
        System.out.println("我叫"+getName()+",学号"+getStudentId()+",成绩"+getScore()+",导师是"+getAdvisor());
    }
    public void research(){
        System.out.println("我在做科研");
    }
}

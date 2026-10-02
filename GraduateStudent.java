package round202;

//继承Student类
public class GraduateStudent extends Student {
    private String advisor;
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

        System.out.println("我是"+ this.getName()+",学号"+this.getStudentid()+",成绩为"+this.getScore()+",导师是"+this.getAdvisor());
    }
    public void research(){
        System.out.println("我在做科研");
    }

}

package round202;

public class Operator {
    Student[] arr;
    GraduateStudent g;
    public Operator(Student[] arr) {
        this.arr=arr;
    }
 public void introduce(){
     for (int i = 0; i < arr.length; i++) {
         Student s=arr[i];
         System.out.println("我是"+ s.getName()+",学号"+s.getStudentid()+",成绩为"+s.getScore());
     }
 }
}

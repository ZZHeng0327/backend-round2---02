package round202;

public class Task1 {
    public static void main(String[] args) {
        //用数组存三个学生的信息
        Student[] arr = new Student[3];
        Student s1= new Student();
        s1.setName("不嘻嘻");
        s1.setStudentid("uestc01");
        s1.setScore(145);
        arr[0]=s1;
        arr[1] = new Student("不鸡丢", "uestc02", 100);
        arr[2] = new Student("哈哈哈", "uestc03", 150);
        Operator s = new Operator(arr);
        s.introduce();
        //创建研究生读对象
        GraduateStudent g=new GraduateStudent("好吧好吧","uestc04",200,"一数");
       System.out.println("====================================");
        g.introduce();
        g.research();
    }
}

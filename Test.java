package round202;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("不嘻嘻");
        s1.setStudentId("uestc01");
        s1.setScore(100);

        Student s2 = new Student("不鸡丢", "uestc02", 145);
        Student s3 = new Student("哈哈哈", "uestc03", 125);
        s1.introduce();
        s2.introduce();
        s3.introduce();
        System.out.println("===================================");

        Student s = new GraduateStudent("好吧好吧", "uestc04", 200, "一数");
        s.introduce();


    }
}

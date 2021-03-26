package filetest;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/9/7 15:39
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("黄瓜",15);

        Student s2 = new Student("黄1",18);

        System.out.println("姓名:"+s1.getName()+"年龄："+s1.getAge()+"学号："+s1.getId());
        System.out.println("姓名:"+s2.getName()+"年龄："+s2.getAge()+"学号："+s2.getId());

        Student s3 = new Student();
        s3.setName("张三");
        s3.setAge(19);
        System.out.println("姓名:"+s3.getName()+"年龄："+s3.getAge()+"学号："+s3.getId());
        //sout
    }
}

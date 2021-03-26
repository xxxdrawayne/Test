package Collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/14 14:03
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
        Student s1 = new Student("张启",15);
        Student s2 = new Student("张san",17);
        Student s3 = new Student("张子",19);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        ts.add(new Student("张启",19));

        for (Student s:ts)
            System.out.println(s.getName()+s.getAge());
        System.out.println("____________________________________");

        TreeSet<Student> trs = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                int num = t1.getAge() - student.getAge();
                int num2 = num==0?t1.getName().compareTo(student.getName()):num;
                return num2;
            }
        });

        trs.add(s1);
        trs.add(s2);
        trs.add(s3);
        trs.add(new Student("张启",19));

        for (Student s:trs)
            System.out.println(s.getName()+s.getAge());
    }
}

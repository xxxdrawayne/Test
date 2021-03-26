package Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/13 20:56
 */
public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
//        set.add("123");
//        System.out.println(set.add("123"));
//        Student s1 = new Student("张启",15);
//        Student s2 = new Student("张san",17);
//        Student s3 = new Student("张子",19);
//
//        set.add(s1);
//        set.add(s2);
//        set.add(s3);
//
//        set.add(new Student("张启",15));
        while(set.size()<10) {
            Random r = new Random();
            int i = r.nextInt(20)+1;
            set.add(i);
        }
        Set<String> ss = Set.of("yang","tang","chen");
        for(String s:ss)
            System.out.println(s);
    }
}

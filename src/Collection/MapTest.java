package Collection;

import java.util.*;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/15 16:22
 */
public class MapTest {
    public static void main(String[] args) {
//        Map<String,String> m = new HashMap<String,String>();
//
//        m.put("001","zhangqi");
//        m.put("002","tcp");
//        m.put("003","chenyibin");
//
//        System.out.println(m.get("001"));
//
//        Set<String> s = m.keySet(); //获取键值
////        System.out.println(s);
//
//        Collection l = m.values();
//        System.out.println(l);
//        for(String ss:s) {      //利用键值得到value遍历
//            String v = m.get(ss);
//            System.out.println(ss+v);
//
//        }
//        Set<Map.Entry<String, String>> entries = m.entrySet();
//        for(Map.Entry<String, String> me:entries) {
//            System.out.println(me.getKey()+me.getValue());
//        }
        Map<Student,String> map = new HashMap<Student, String>();
        Student s1 = new Student("张启",15);
        Student s2 = new Student("唐才萍",17);
        Student s3 = new Student("朱家豪",19);
        Student s4 = new Student("陈奕斌",23);
 //       Student s5 = new Student("陈奕斌",23);
        map.put(s1,"渭南");
        map.put(s2,"商洛");
        map.put(s3,"临潼");
        map.put(s4,"汕头");
//        map.put(s5,"汕头");

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for(Map.Entry<Student, String> me:entries)
            System.out.println(me.getKey().getName()+","+me.getKey().getAge()+","+me.getValue());
    }
}

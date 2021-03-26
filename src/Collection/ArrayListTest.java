package Collection;

import java.util.*;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/9/14 11:13
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("nmsl");
        al.add("wdnmd");
        al.add("1");
 //       System.out.println(al);
//        al.remove(1);
//
//        System.out.println(al);
//        System.out.println(al.contains("wdnmd"));
//        System.out.println(al.size());

        Iterator<String> it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------");
        ListIterator<String> lt = al.listIterator();
        while (lt.hasNext()) {
            String S = lt.next();
            if(S.equals("nmsl"))
                lt.add("sunxiaochuan");
            System.out.println(S);
        }

        System.out.println("--------------------");
        while(lt.hasPrevious()) {
            System.out.println(lt.previous());
        }
//        System.out.println(al);
        System.out.println("--------------------for");
        for(String i:al) {
            System.out.println(i);
        }
    }

}
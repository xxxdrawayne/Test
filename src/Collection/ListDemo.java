package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/13 15:40
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String> ();
        l.add("hello");
        l.add("world");
        l.add("man");
        l.add(0,"woman");
//        System.out.println(l.remove(0));
        System.out.println(l.get(0));
        l.set(0,"wowo");
//        l.size()  集合大小
        System.out.println(l);

        System.out.println("------------------");
        for(String i:l) {
            System.out.println(i);
        }

        System.out.println("------------------");
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("------------------");
        for(int i=0; i<l.size(); i++) {
            String s = l.get(i);
            System.out.println(s);
        }
    }
}

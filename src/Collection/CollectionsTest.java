package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/16 12:54
 */
public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random r = new Random();
        for(int i=0; i<20; i++) {
            list.add(r.nextInt(100));
        }
        Collections.sort(list);
        Collections.shuffle(list); //随机排序
        Collections.reverse(list); //反转
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}

package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Set不包含重复的元素  没有带索引的方法
/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/13 20:53
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        List<?> l1 = new ArrayList<String>();
        List<?super Integer> l2= new ArrayList<Number>();
//        List<?extends Integer> l3= new ArrayList<Number>();
//        List<?super Number> l4= new ArrayList<Integer>();
        List<?extends Number> l5= new ArrayList<Integer>();
    }
//    public int add(int ...a){
//        return 1;
//    }
}

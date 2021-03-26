package Collection;

import java.util.*;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/15 17:09
 */
public class Test {
    public static void main(String[] args) {
        Map<String,String> m1 = new HashMap<String,String>();
        Map<String,String> m2 = new HashMap<String,String>();
        Map<String,String> m3 = new HashMap<String,String>();
        m1.put("001","zhangqi");
        m1.put("002","tcp");
        m1.put("003","chenyibin");
        m2.put("001","zhangqi");
        m2.put("002","tcp");
        m2.put("003","chenyibin");
        m3.put("001","zhangqi");
        m3.put("002","tcp");
        m3.put("003","chenyibin");

        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        list.add(m1);
        list.add(m2);
        list.add(m3);

        System.out.println(list);
        for(Map<String,String> hm:list) {
            Set<String> strings = hm.keySet();
            for(String s:strings) {
                System.out.println(s+","+hm.get(s));
            }
        }
    }
}

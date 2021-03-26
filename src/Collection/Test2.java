package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/15 17:28
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<string.length(); i++) {
            char key = string.charAt(i);
            Integer value = hm.get(key);
            if(!hm.containsKey(key)) {
                 hm.put(key,1);
            }
            else {
                value++;
                hm.put(key,value);
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
        for(Map.Entry<Character, Integer> me:entries) {
            sb.append(me.getKey()).append('(').append(me.getValue()).append(')');
            //System.out.println(me.getKey()+"   "+me.getValue());
        }
        System.out.println(sb);
    }
}

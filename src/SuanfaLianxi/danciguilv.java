package SuanfaLianxi;

import java.util.HashMap;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/16 11:39
 */
public class danciguilv {

    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("abc");
//        System.out.println(sb.toString());
        boolean b = wordPattern("abba", "dog cat cat dog");
        System.out.println(b);
    }

    public static boolean wordPattern(String pattern, String s) {
        if(pattern == null || s==null) return false;
        String[] sb = s.split(" ");
        if(pattern.length() != sb.length) return false;

        int i=0;
        HashMap<Character,String> map = new HashMap<>();

        char[] charArray = pattern.toCharArray();
        for(char ch:charArray) {
            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(sb[i])) return false;
            }
            else {
                if(map.containsValue(sb[i])) return  false;
                else
                    map.put(ch,sb[i]);
            }
            i++;
        }
        return true;
    }
}

package SuanfaLianxi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/30 20:01
 */
class LRUCache {
    Map<Integer,Integer> map = new HashMap<>();
    int capacity;
    LinkedList<Integer> q = new LinkedList<Integer>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.get(key)!=null) {
            q.remove(new Integer(key));
            q.add(key);
            // q.add(q.poll());
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.size()<capacity) {
            if(map.containsKey(key)) {
                map.put(key,value);
                q.remove(new Integer(key));
                q.add(key);
            }
            else {
                map.put(key,value);
                q.add(key);
            }
        }
        else {
            if(map.containsKey(key)) {
                map.put(key,value);
                q.remove(new Integer(key));
                q.add(key);
            }
            else {
                map.remove(q.poll());
                map.put(key,value);
                q.add(key);
            }
        }

    }
}
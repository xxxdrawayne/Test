package SuanfaLianxi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ywt
 * @version 1.0
 * @date 2021/3/25 12:40
 */

class LNode {
    int val;
    LNode next;
    LNode() {}
    LNode(int val) { this.val = val; }
    LNode(int val, LNode next) { this.val = val; this.next = next; }
 }
public class deleteDuplicates {
    public static void main(String[] args) {
        LNode head = new LNode(1);
        head.next = new LNode(2);

        LNode l = deleteDuplicates(head);
    }
    public static LNode deleteDuplicates(LNode head) {
        List<Integer> list = new ArrayList<>();
        LNode ln = new LNode();
        int temp;
        while(head!=null) {
            temp = head.val;
            if(head.val == head.next.val) {
                head = head.next;
            }
            if(head.val!=head.next.val&&head.val!=temp) {
                if(ln==null)
                    ln.val = head.val;
                ln.val = head.val;
                ln.next = head;
            }
        }
        return ln;
    }
}

//package SuanfaLianxi;
//
///**
// * @author ywt
// * @version 1.0
// * @date 2020/11/21 18:52
// */
//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}
//
//public class InsertSort {
//    public static void main(String[] args) {
//        System.out.println(isAnagram("a","b"));
//        //new InsertSort().insertionSortList();
//    }
//
//    public ListNode insertionSortList(ListNode head) {
//
//        ListNode preHead = new ListNode(0);
//        ListNode pre;
//        preHead.next = head;
//
//        while(head!=null && head.next!=null) {
//            if(head.val <= head.next.val) {
//                head = head.next;
//                continue;
//            }
//            pre = preHead;
//            while(pre.next.val <= head.next.val)
//                pre = pre.next;
//            ListNode temp = head.next;
//            head = temp.next;
//            head.next = pre.next;
//            pre.next = temp;
//        }
//        return preHead.next;
//    }
//
//    public static boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length())
//            return false;
//        int[] arr = new int[26];
//        for(int i=0; i<s.length(); i++) {
//            arr[s.charAt(i)-'a']++;
//        }
//        for(int i=0; i<t.length(); i++) {
//            arr[t.charAt(i)-'a']--;
//        }
//        for(int i=0; i<26; i++) {
//            if(arr[i]>0)
//                return false;
//        }
//        return true;
//    }
//}

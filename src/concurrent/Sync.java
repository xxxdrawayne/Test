package concurrent;

import java.io.FileReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ywt
 * @version 1.0
 * @date 2021/3/22 16:10
 */
class A {
    private int age;
    private void show() {
        System.out.println("show");
    }
}

public class Sync extends  A{
    public static void main(String[] args) {
        int x=0,s=0;
        while(!(x!=0)) s+=x;

        Deque<Object> objects = new LinkedList<>();
        System.out.println(s);
    }
}

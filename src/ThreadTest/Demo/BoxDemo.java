package ThreadTest.Demo;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/21 16:47
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();

        Producer p = new Producer(b);
        Customer c = new Customer(b);
        Thread thp = new Thread(p);
        Thread thc = new Thread(c);

        thp.start();
        thc.start();
    }
}

package ThreadTest;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/20 16:03
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread th1 = new Thread(r,"窗口1");
        Thread th2 = new Thread(r,"窗口2");
        Thread th3 = new Thread(r,"窗口3");
        th1.start();
        th2.start();
        th3.start();

    }
}

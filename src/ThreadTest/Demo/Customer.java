package ThreadTest.Demo;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/21 16:52
 */
public class Customer implements Runnable {
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while(true)
            b.get();
    }
}

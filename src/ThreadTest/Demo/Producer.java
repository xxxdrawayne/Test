package ThreadTest.Demo;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/21 16:51
 */
public class Producer implements Runnable {
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for(int i=1; i<=5; i++)
            b.put(i);
    }
}

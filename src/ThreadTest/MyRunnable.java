package ThreadTest;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/20 15:43
 */
public class MyRunnable implements Runnable {
    private int ticket = 10;

    @Override
    public void run() {

        while (true) {
//            Object obj = new Object();
//            synchronized (obj) {

            sellTicket();

        }

    }

    private synchronized void sellTicket() {
        if(ticket >0 ) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "  " + ticket--);
        }
    }

}

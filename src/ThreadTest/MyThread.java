package ThreadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/9/8 19:51
 */
class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }


    Lock lock = new ReentrantLock();



    public void run() {
        //super.run();
        try {
            lock.lock();
            for(int i=0; i<10; i++) {
                System.out.println(this.getName()+":"+i);
            }
        }finally {
            lock.unlock();
        }
    }

}


package ThreadTest;

import Reflect.Student;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/18 17:25
 */
//join()  等待线程死亡
//setDaemon()   设置守护线程， 当运行的唯一线程都是守护进程线程时，Java虚拟机将退出
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new MyThread();
        Thread th2 = new MyThread();
        th1.setName("线程1");
        th2.setName("线程2");
        Thread th3 = new MyThread("线程3");
        Thread th4 = new Thread(new MyRunnable(),"线程4");
//        th1.setPriority(10);
//        th2.setPriority(5);
//        th3.setPriority(1);
        th1.setDaemon(true);
//        th2.setDaemon(true);
//        th3.setDaemon(true);
        th3.start();
 //       th3.join();

        th2.start();
//        th1.join();
        th1.start();

//        th4.start();
        System.out.println(Thread.currentThread().getPriority());
    }
}

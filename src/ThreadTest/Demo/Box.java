package ThreadTest.Demo;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/21 16:48
 */
public class Box {
    private int milk;

    //定义箱子的状态
    private boolean state = false;

    public synchronized void put(int milk) {

        if(state) {    //如果箱子里待消费 等待消费者
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工将第几瓶牛奶放入箱子："+milk);
        state = true;
        notify();
        
    }

    public synchronized void get() {
        if(!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("顾客将第几瓶牛奶取出箱子："+this.milk);
        state = false;
        notify();
    }
}

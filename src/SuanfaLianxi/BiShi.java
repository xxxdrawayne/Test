package SuanfaLianxi;

/**
 * @author ywt
 * @version 1.0
 * @date 2021/3/12 14:27
 */
public class BiShi {
    public static void main(String[] args) {
//        for(int i=0; i<2; i++) {
//            if(i==0) {
                new Thread(()->{
                        System.out.println("线程"+Thread.currentThread().getName()+
                                "进入休眠，休眠时间为：1秒");
                        try {
                            Thread.sleep(1000);
                            System.out.println("线程A休眠结束");
                        }catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                },"A").start();
                new Thread(()->{
                    System.out.println("线程"+Thread.currentThread().getName()+
                            "进入休眠，休眠时间为：3秒");
                    try {
                        Thread.sleep(3000);
                        System.out.println("线程B休眠结束");
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                },"B").start();
        }
       //new test().method();

}

class test {
    public void method() {
        int flag=1;
        for(int i=1; i<=9; i++) {
            flag=1;
            for(int j=1; j<=i; j++) {
                if(flag>5) {
                    System.out.println();
                    flag = 1;
                }
                System.out.print(j+"*"+i+"="+i*j);
                if(flag<5&&j!=i) {
                    System.out.print("\t");
                }
                flag++;
            }

                System.out.println();
        }

    }
}
class test1 {
    public void method() {
        int flag=1;
        for(int i=1; i<=9; i++) {
            for(int j=1; j<=i; j++) {

                System.out.print(j+"*"+i+"="+i*j);
                if(j!=i) {
                    System.out.print("\t");
                }

            }
            //if(i!=9)
             System.out.println();
        }

    }
}

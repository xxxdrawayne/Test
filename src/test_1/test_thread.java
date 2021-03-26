package test_1;

class Main extends Thread {
    Sub c;
    public Main(Sub calc) {
       c = calc;
    }
    public void run() {
       synchronized(c) {
          try {
             System.out.println("Waiting for calculation...");
             c.wait();
          } catch (InterruptedException e) {}
       }
       System.out.println("Total is: " + c.total);
    }
    public static void main(String [] args) {
       Sub calculator = new Sub();
       calculator.start();
       new Main(calculator).start();
       new Main(calculator).start();
       new Main(calculator).start();
    }
 }
 class Sub extends Thread {
    int total;
    public void run() {
    	try {
			sleep(1000);
		} catch (InterruptedException e) {
		}
        synchronized(this) {
          for(int i=0;i<100;i++) {
             total += i;
          }
          notifyAll();
}}}

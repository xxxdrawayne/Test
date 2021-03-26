package test_1;

class pta2 {
	private static int cnt=0;
    public void run() {
new Thread(()->{
     	   try {
     		   Thread.sleep(1000);
     	   } catch (InterruptedException e) {
     	   }
     	   synchronized(this) {
     		   cnt++;
     	   }
        }).start();
    }
    public static void main(String [] args) {
    	try {
    	pta2 m = new pta2();
       for ( int i=0; i<3; i++ )
        	m.run();
			Thread.sleep(5000);
			System.out.println(cnt);
		} catch (InterruptedException e) {
}}}
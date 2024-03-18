package in.com.thread;

public class Test_A_B {
public static void main(String[] args) {
	Thread t1 = new Thread(new A());
	Thread t2 = new Thread(new B());
	 
	t1.start();//BY USING START METHOD GIVEN OUTPUT IS NOT LINEAR
	t2.start();
	
//	t1.run(); // BY USING RUN METHOD GIVEN OUTPUT IS LINEAR
//	t2.run();
}
}
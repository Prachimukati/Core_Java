package in.com.thread;

public class Test_Byrunnable {
public static void main(String[] args) {
	Thread t1 = new Thread(new Byrunnable ("India"));
	Thread t2 = new Thread(new Byrunnable ("South Africa"));
	
	t1.setPriority(10);
	t2.setPriority(1);
	
	t1.start();
	
//	try {
//		t1.join();
//	} catch (Exception e) {	
//	}
	t2.start();
}
}
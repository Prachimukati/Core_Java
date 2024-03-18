package in.com.thread;

public class Test_WithThread {
public static void main(String[] args) {
	WithThread w1 = new WithThread("JAVA");
	WithThread w2 = new WithThread("PHYTON");
	
//	w1.setPriority(10);
//	w2.setPriority(5);
	
//	w1.start();
//	
//	w2.start();
	w1.run();
	w2.run();
	
//	try {
//		w2.join();
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
}
}
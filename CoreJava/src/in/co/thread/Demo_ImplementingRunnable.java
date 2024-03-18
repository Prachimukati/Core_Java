package in.co.thread;

class B implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println("Chandu");
		}	
	}	
}
public class Demo_ImplementingRunnable {
public static void main(String[] args) {
	B r = new B();
	Thread t = new Thread(r);
	t.start();
}
}

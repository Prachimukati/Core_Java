package in.com.thread;

class A implements Runnable{
	public void run() {
		int i;
		for ( i = 0; i <=20; i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
			System.out.println("Thread A" +" "+ i);
		}
	}
}
class B implements Runnable{
	public void run() {
		int i;
		for ( i = 0; i <=20; i++) {
			System.out.println("Thread B" +" "+ i);
		}
	}
}	
public class Example_thread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());
		
		t1.run();
		t2.run();
		
//		t1.start();
//		t2.start();
	}

}

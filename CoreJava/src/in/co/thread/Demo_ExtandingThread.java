package in.co.thread;

class A extends Thread{
	@Override
	public void run() {
		
			try {
				for (int i = 0; i <=5; i++) {
					System.out.println("Prachi");
				Thread.sleep(1000);
			} }catch (InterruptedException e) {
				System.out.println(e);
			}
	}
}
public class Demo_ExtandingThread {
public static void main(String[] args) throws InterruptedException{
	A t = new A();
	t.start();
	for (int i = 0; i <=5; i++) {
		System.out.println("Madhu");
		Thread.sleep(1000);

	}
}
}

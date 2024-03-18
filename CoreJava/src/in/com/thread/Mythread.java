package in.com.thread;

public class Mythread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("MyThread value ="+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}

}

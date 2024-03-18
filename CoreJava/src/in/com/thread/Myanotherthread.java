package in.com.thread;

public class Myanotherthread extends Thread{
	@Override
	public void run() {
	for (int i = 10; i >=10; i++) {
		System.out.println("Myanotherthread ="+i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	}
}

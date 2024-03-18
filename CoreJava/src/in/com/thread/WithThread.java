package in.com.thread;

public class WithThread extends Thread{

	String name = null;
	public WithThread(String name ) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i<=5; i++) {
//			try {
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
			System.out.println(name +" "+ i);
		}
		
	}
}

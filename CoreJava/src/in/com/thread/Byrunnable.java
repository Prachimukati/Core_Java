package in.com.thread;

public class Byrunnable implements Runnable{

	String name = null;
	
	public Byrunnable(String name ) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i <=10; i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(name+" "+i);
		}
		
	}

	
}

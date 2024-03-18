package in.com.thread;

public class Racing extends Thread{

	String name = null;
	static Amount ac = new Amount();
	
	public Racing(String name ) {
		this.name = name;
	}
	@Override
	public void run() {
	for (int i = 0; i <=10; i++) {
		this.ac.deposite(name,10);
	}
	}
}
package in.co.thread;

class Thread3 extends Thread{
public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Welcome");
	}
}
class Thread4 extends Thread{
	public void run() {
		
		while (true) {
			System.out.println("Good morning");
		}
	}
}
public class Test_Sleep_mtd {
public static void main(String[] args) {
	Thread1 t1 = new Thread1 ();
	Thread2 t2 = new Thread2();
	
	t1.start();
}
}

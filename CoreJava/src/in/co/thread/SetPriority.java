package in.co.thread;

class Thread5 extends Thread{
	
	String name ;
	public Thread5( String name ) {
		this.name = name;
	}
	public void run() {
		
		for (int i = 0; i <=10; i++) {
			System.out.println(name+" "+i);
		}
		
	}
}
public class SetPriority {
public static void main(String[] args) {
	Thread5 t1 = new  Thread5("prachi");
	Thread5 t2 = new  Thread5("chandu");
	
	t1.setPriority(10);
	t2.setPriority(1);
	
	t1.start();
	t2.start();

}
}

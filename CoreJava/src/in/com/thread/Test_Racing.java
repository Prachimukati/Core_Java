package in.com.thread;

public class Test_Racing {
public static void main(String[] args) {
	Racing r1 = new Racing("Ram");
	Racing r2 = new Racing("Shayam");
	
	r1.start();
	r2.start();
}
}

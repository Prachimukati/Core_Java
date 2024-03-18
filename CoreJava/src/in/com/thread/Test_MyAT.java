package in.com.thread;

public class Test_MyAT {
public static void main(String[] args) {
	Mythread my = new Mythread();
	Thread t1 = new Thread(my);
	
	Myanotherthread m1 = new Myanotherthread();
	
	t1.start();	
	m1.start();
}
}
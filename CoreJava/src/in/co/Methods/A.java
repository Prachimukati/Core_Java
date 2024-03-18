package in.co.Methods;

public class A {
public static void main(String[] args) {
	A a = new A();
	a.disp();
	A.add();//Repeatation=can not call this method by class name.Because it is non-static
	A.add();//we can call this method without obj . we can  call this method by 
			// Class name because it is static .
}	
	void disp() {
		System.out.println("Learn coading");
	}
	public static void add() {
		int a = 10 , b = 20;
		System.out.println("sum = "+(a+b));
	}
}

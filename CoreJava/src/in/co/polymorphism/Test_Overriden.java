package in.co.polymorphism;

class P{
	void show() {
		System.out.println("super class");
	}
}
class B extends P {
	@Override
	void show() {
		System.out.println("sub class");
	}
}
public class Test_Overriden {
public static void main(String[] args) {
	P r = new B();
	r.show();
}
}

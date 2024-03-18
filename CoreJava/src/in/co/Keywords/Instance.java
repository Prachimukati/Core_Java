package in.co.Keywords;

class A {
	int a;
	String b;

	void show() {
		a = 30;
		b = "piyush";
		System.out.println(a + " " + b);
	}

	A() { // Default Constructor
		a = 10;
		b = "Vedu";
		System.out.println(a + " " + b);
	}

	{ // Instance Block
		a = 20;
		b = " chetan";
		System.out.println(a + " " + b);
	}
//    First call Instance block ==> Constructor ==> Method

}

public class Instance {
	public static void main(String[] args) {
		A ref = new A();
		ref.show();
	}
}

package in.co.Keywords;

class B {
	int a = 10;

	void show() {
		System.out.println(a);
	}
}

class C extends B {
	int a = 20;

	void show() {
		System.out.println(a);
		System.out.println(super.a);
	}
}

public class Same_name_super {
	public static void main(String[] args) {
		C r = new C();
		r.show();
		// B r2 = new B(); WE USE THIS LOGIC IF
		//WE DONOT USE SUPER KEYWORD
		// r2.show();
	}
}

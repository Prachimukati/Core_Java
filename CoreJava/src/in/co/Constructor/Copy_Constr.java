package in.co.Constructor;

class C {

	int a;
	String b;

	C() {
		a = 10;
		b = " Chandu ";
		System.out.println(a + " " + b);
	}

	C(C ref) {
		a = ref.a;
		b = ref.b;
		System.out.println("copy " + a + " " + b);
	}
}

public class Copy_Constr {
	public static void main(String[] args) {
		C r = new C();
		C r2 = new C(r);

	}
}

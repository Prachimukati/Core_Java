package in.co.Constructor;

class B {
	String a;
	double b;
	int c;

	private B() {
		a = "Prachi";
		b = 10.00;
		c = 10;
//		System.out.println(a+" "+b+" "+c);
	}

	B(String x) {
		a = x;
//		System.out.println(a);
	}

	B(double y, int z) {
		b = y;
		c = z;
//		System.out.println(b+" "+c);
	}

	public static void main(String[] args) {
		B r = new B();
		B r1 = new B("Madhu");
		B r2 = new B(500.0, 100);
		System.out.println(r.a + " " + r.b + " " + r.c);
		System.out.println(r1.a);
		System.out.println(r2.b + " " + r2.c);

	}
}

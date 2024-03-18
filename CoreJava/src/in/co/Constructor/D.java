package in.co.Constructor;

class D {
	int a;
	String b;
	double c;

	private D() {
		a = 10;
		b = "Prachi";
		c = 10.0;
		System.out.println(a + " " + b + " " + c);
	}

//	static void show() {
//		optional to make this method
//	}
	public static void main(String[] args) {
		D ref = new D();
//	ref.show();
	}
}

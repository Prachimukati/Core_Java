package in.co.Constructor;

 class Demo {
		int a; String name ;

	void Demo() {
		a = 0 ; name  = "null";
	}
	void show() {
		System.out.println(a +" "+ name);
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.Demo();
		d.show();
	}
}

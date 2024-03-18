package in.co.Inheritance;

class D{
	void input() {
		System.out.println("Enter your name: ");
	}
}
class E extends D {
	void show() {
		System.out.println("My name is prachi: ");
	}
}
class F extends D{
	void disp() {
		System.out.println("My name is Madhu: ");
	}
}
public class Demo_c {
public static void main(String[] args) {
	E r = new E(); 
	F r2 = new F();
	r.input();	r.show(); 
	r2.input();  r2.disp();
}
}

package in.co.Inheritance;

class A{
	int a, b , c ;
	void add() {
		a =  10 ; b = 20 ;
		c = a + b;
		System.out.println("Sum of two num = " + c);
	}
}
class B extends A {
	void sub() {
		a =  20 ; b = 10 ;
		c = a - b;
		System.out.println("Sub of two num = " + c);
	}
	void mult() {
		a =  10 ; b = 20 ;
		c = a * b;
		System.out.println("mult of two num = " + c);
	}
}
class C extends B {
	void div() {
		a =  10 ; b = 20 ;
		c = a / b;
		System.out.println("div of two num = " + c);
	}
	void rem() {
		a =  10 ; b = 20 ;
		c = a % b;
		System.out.println("rem of two num = " + c);
	}
}
public class Test_C {
public static void main(String[] args) {
	C c = new C();
	c.add();
	c.sub();
	c.mult();
	c.div();
	c.rem();
}
}

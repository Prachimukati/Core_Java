package in.com.constructor;

public class Test_A {
public static void main(String[] args) {
	A ref = new A();
	A ref1 = new A(90,90.0);
	System.out.println(ref.a+" "+ref.b);
	System.out.println(ref1.a+" "+ref1.b);
}
}

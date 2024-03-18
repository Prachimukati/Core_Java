package in.co.Recursion;

public class A {
public static void main(String[] args) {
	A a = new A();
	int m = a.sum(3);  // Calling
	System.out.println(m);
}
	int sum(int b) { 
		if (b>0) {
			return b+sum(b-1);//  Calling
		} else {
			return 0;
		}
	}
}

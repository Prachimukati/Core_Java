package in.co.Exception;

public class Nested_Finalluy {
public static void main(String[] args) {
	try {
		String str = "prachi";
		System.out.println(str.toUpperCase());
	} catch (Exception e) {
		System.out.println(e);
	}
	finally {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e1) {
			System.out.println(e1);
		}
		finally {
			System.out.println("Always execute");
		}
	}
	System.out.println("Normal termination");
}
}
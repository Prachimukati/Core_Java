package in.co.Exception;

public class Arithmtc {
public static void main(String[] args) {
	int a = 10 , b = 0 , c ;
	try {
		c = a / b ;
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e);
    }
	finally {
		System.out.println("Always execute");
	}
	System.out.println("Main method execute");
}
}

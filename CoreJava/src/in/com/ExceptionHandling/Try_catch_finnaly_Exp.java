package in.com.ExceptionHandling;

public class Try_catch_finnaly_Exp {
public static void main(String[] args) {
	try {
		System.out.println("learning");
		int a = 10 , b =  0 , c;
		c  = a/b;
		System.out.println(c);
		System.out.println("Exception");
		
	} catch (Exception e) {
		System.out.println("can not divide by zero");
	}
	finally {
		System.out.println("Finnaly bolck always exicute");
	}
	System.out.println("....");
}
}

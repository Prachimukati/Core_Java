package in.co.Exception;

public class Multiple_Trycatch {
public static void main(String[] args) {
	try {
		int a = 10 , b =  0 , c ;
		c = a / b ;
		System.out.println(c);
	} catch (ArithmeticException e) {
		System.out.println("Can not divide by zero");
	}
	try {
		int a[] = {10,20,30,40};
		System.out.println(a[5]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Out of index");
	}
}
}

package in.co.Exception;

public class Multiple_Catch {
public static void main(String[] args) {
	try {
		int a = 10 , b = 0 , c ;
		c  = a / b ;
		System.out.println(c);
		
		int arr[] = {10,20,30};
		System.out.println(arr[5]);
		
		String str = null ;
		System.out.println(str.toUpperCase());
		
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Index out of bond");
	}
	catch (ArithmeticException e) {
		System.out.println("Arithmatic exceptionn");
	}
	catch (NumberFormatException e) {
		System.out.println("Number Exception");
	}	
	catch (Exception e) {
		System.out.println("All type exception hanlded");
	}
}// Exception e = new NullPointerException
//if exception in whole program so the first exception is handle other is not
}

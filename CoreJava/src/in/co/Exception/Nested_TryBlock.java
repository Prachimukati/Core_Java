package in.co.Exception;

public class Nested_TryBlock {
public static void main(String[] args) {
	try {
		
		try {
			int a = 10 , b = 0 , c ;
			c = a / b ;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception");
		}
		int arr[] = {10,20,30};
		System.out.println(arr[6]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bond");
	}
// IF WE WANT TO HANDLE BOTH EXCEPTION 	
}
}

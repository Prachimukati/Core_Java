package in.co.Exception;

public class Nested_Catch {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
	} catch (Exception e) {
		try {
			String str = null ;
			System.out.println(str.toLowerCase());
		} catch (NullPointerException e2) {
			System.out.println("Null pointer Exception ");
		}
		System.out.println("Main method ended");
	}
	// WE USE NESTED CATCH BLOCK IF WE HAVE RISKY CODE IN CATCH BLOCK AND 
	//WE HAVE TO HANDLE EXCEPTION 
}
}

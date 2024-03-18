package in.co.Exception;

public class NPE {
public static void main(String[] args) {
	String str = null ;
	try {
		System.out.println(str.toUpperCase());

	} catch (Exception e) {
		System.out.println("Null can not be casted");
	}
}
}

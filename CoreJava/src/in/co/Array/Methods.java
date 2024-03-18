package in.co.Array;

import java.util.Arrays;

public class Methods {
public static void main(String[] args) {
	String a[] = {"Learning","Java" };
//	int a[] = {10,20,30}; as list method print a[] reference
	System.out.println("toString"+Arrays.toString(a));
	System.out.println("asList"+Arrays.asList(a));
	System.out.println("deeptoString"+Arrays.deepToString(a));

}
}

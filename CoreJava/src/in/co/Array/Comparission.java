package in.co.Array;

import java.util.Arrays;

public class Comparission {
public static void main(String[] args) {
	int a[] = {10,20,30,40,50};
	int a2[] = {10,20,30,40,50};
	
	if (Arrays.equals(a, a2)) 
	{
		System.out.println("Both are equal");
	} else 
	{
		System.out.println("Both are not equal");
	}
}
}

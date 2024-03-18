package in.co.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Copyof_Method {
public static void main(String[] args) {
	int a[] = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element in array");
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}	
	int a2[] = Arrays.copyOf(a, 5);//(a,6)
//	a2[5] = 90;
	System.out.println("Enter element in array a2");
	for (int i = 0; i < a.length; i++) {  // a2.length =a
		System.out.println(a2[i]);
	}
}
}

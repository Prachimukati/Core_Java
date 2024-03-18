package in.co.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Method {
public static void main(String[] args) {
	int a[] = new int[5];
	int b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element");
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	Arrays.sort(a);
	System.out.println("Enter element");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
}
}

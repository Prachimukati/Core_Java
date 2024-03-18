package in.co.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Equals_compare {
public static void main(String[] args) {
	int a[] = new int [5];
	int a2[] = new int [5];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element in a");
	for (int i = 0; i < a2.length; i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Enter element in a2");
	for (int i = 0; i < a2.length; i++) {
		a2[i] = sc.nextInt();
	}
	boolean b = Arrays.equals(a, a2);
	System.out.println("Both are equal: " +b);
}
}

package in.co.Array;

import java.util.Scanner;

public class Find_element {
public static void main(String[] args) {
	int a[] = new int [5];
	int n;
	int count = 0;
	System.out.println("Enter element");
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	} 
	System.out.println("Array element");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println("Search element");
	n = sc.nextInt();//   We use n to search element =4
	for (int i = 0; i < a.length; i++) {
		if (a[i]==n) {// A[i]==n 
			count++;
		}
	}
	if (count>0) { // 4>0 true
		System.out.println("Item found");
	}
	else {
		System.out.println("Item not found");
	}
}
}

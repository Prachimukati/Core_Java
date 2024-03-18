package in.co.Array;

import java.util.Scanner;

public class Tranfer_Element {
public static void main(String[] args) {
	 int a[] = new int[5];
	 int b[] = new int[5];	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("First element");
	 for (int i = 0; i < 5; i++) {
		a[i] = sc.nextInt();
	}
	 System.out.println("Array element");
	 for (int i = 0; i < 5; i++) {
		 System.out.println(a[i]);
	 }
	 System.out.println("Second element");
	 for (int i = 0; i < 5; i++) {
		 b[i] = a[i];
		 System.out.println(b[i]);

	 }
	 
}
}

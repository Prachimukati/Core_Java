package in.co.Array;

import java.util.Scanner;

public class Add_element {
public static void main(String[] args) {
	int a[] = new int[5];
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter element");
	 for (int i = 0; i < 5; i++) {
		a[i] = sc.nextInt();
	}
	 System.out.println("Print element");
	 for (int i = 0; i < 5; i++) {
		 System.out.println(a[i]);
		 sum = a[i]+sum;
}
	 System.out.println("Addition of array element " + sum);
}
}

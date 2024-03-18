package in.co.Array;

import java.util.Scanner;

public class Smallest_num {
public static void main(String[] args) {
	int a[] = new int [5];
	int min;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element");
	for (int i = 0; i < 5; i++) {
		a[i] = sc.nextInt();
	}
	min = a[0];
	for (int i = 1; i < 5; i++) {
		if (min>a[i]) {
			min = a[i];
		}
	}
	System.out.println("Minimum Element "+min);
	
}
}

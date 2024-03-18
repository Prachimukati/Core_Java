package in.co.Array;

import java.util.Scanner;

public class Biggest_num {
public static void main(String[] args) {
	int a[] = new int [5];
	int max;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element");
	for (int i = 0; i < 5; i++) {
		a[i] = sc.nextInt();
	}
	max = a[0];
	for (int i = 0; i < 5; i++) {
		if (max<a[i]) {
			max = a[i];
		}
	}
	System.out.println("Maximum Element "+max);
	
}
}

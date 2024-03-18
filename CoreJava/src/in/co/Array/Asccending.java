package in.co.Array;

import java.util.Scanner;

public class Asccending {
public static void main(String[] args) {
	int a[] = new int[5];
	int temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element ");
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]>a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
    }
	System.out.println("Array element ");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
}
	
}
}

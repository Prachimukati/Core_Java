package in.co.pract;

import java.util.Scanner;

public class ForEach_array {
public static void main(String[] args) {
	int a[] = new int [5];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element in array");
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	for(int b : a) {
		System.out.println(b);
	}
 }
}

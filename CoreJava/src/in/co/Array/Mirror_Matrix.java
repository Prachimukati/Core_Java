package in.co.Array;

import java.util.Scanner;

public class Mirror_Matrix {
public static void main(String[] args) {
	int a[][] = new int[2][2];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element");
	for (int i = 0; i <=1; i++) {// row
		for (int j = 0; j <=1; j++) {//colom
			a[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("Matrix : ");
	for (int i = 0; i <=1; i++) {
		for (int j = 0; j <=1; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.print("\n");
	}
	System.out.println("Mirror Matrix : ");
	for (int i = 1; i >= 0; i--) {// change place from top to bottom
	for (int j = 0; j <=1; j++) {// if i apply this same condition in this loop so it is called left to right
			System.out.print(a[i][j]+" ");
		}
		System.out.print("\n");
	}
}
}

package in.co.Array;

import java.util.Scanner;

public class Insert_Element {
	public static void main(String[] args) {
		int  size , loc , item;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		size = sc.nextInt();
		int a[] = new int [size+1];
		System.out.println("Enter elemenet");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Location of element");
		loc = sc.nextInt();
		System.out.println("Item of array");
		item = sc.nextInt();
		System.out.println("Array elemenet");
		for (int i = size; i > loc; i--) { // i=4 , i>3 this for loop doing array position empty
		
		a[i] = a[i-1];// 3-1=a[2]
		}
		a[loc] = item;
		size++;
		for (int i = 0; i <size; i++) {
			System.out.println(a[i]+" ");
			}
}
}
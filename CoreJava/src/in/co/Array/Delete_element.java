package in.co.Array;

import java.util.Scanner;

public class Delete_element {
public static void main(String[] args) {
	int  size , loc , item;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size");
	size = sc.nextInt();
	int a[] = new int [size];
	System.out.println("Enter elemenet");
	for (int i = 0; i < size; i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Location of element");
	loc = sc.nextInt();//1
	System.out.println("Array elemenet");
	for (int i = loc; i <size-1; i++) {// i = 1,2<4-1=2<3
	
	a[i] = a[i+1];// 2+1=a[3]
	}
	size--;
	for (int i = 0; i <size; i++) {
		System.out.println(a[i]+" ");

}
}
}

package in.co.DicisionMaking_Statement;

import java.util.Scanner;

public class Nested {
public static void main(String[] args) {
	int a , b ;
	System.out.println("Enter two number");
	Scanner obj = new Scanner(System.in);
	a=obj.nextInt();
	b=obj.nextInt();
	            
	                       // OR
         //int a =20 , b= 15;
	
	if (a>b) {
		if (a==b) {
			System.out.println("A is equals to B");
		} else {
			System.out.println("A is not equals to B");
		}
	} else {
		if (a<b) {
			System.out.println("B is greater than A");
		} else {
			System.out.println("A is greater than B");

		}
	}
}
}

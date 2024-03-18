package in.co.pract;

import java.util.Scanner;

public class Alphabets {
public static void main(String[] args) {
	char n , i;
	System.out.println("Enter any character");
	Scanner obj = new Scanner(System.in);
	n = obj.next().charAt(0);
	
	for ( i ='A'; i <='Z'; i++) {
		System.out.print( i+" ");
	}
}
}

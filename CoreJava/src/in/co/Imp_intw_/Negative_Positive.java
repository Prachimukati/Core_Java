package in.co.Imp_intw_;

import java.util.Scanner;

public class Negative_Positive {
public static void main(String[] args) {
	int n ;
	System.out.println("Enter any number");
	Scanner obj = new Scanner(System.in);
	n = obj.nextInt();
	if (n>0) {
		System.out.println(" Given number is positive");
	}
	else if (n<0) {
			System.out.println("Given number is negative");
		} 
	 else {
	  System.out.println("Given number is neither negative nor positive");
	}
}
}

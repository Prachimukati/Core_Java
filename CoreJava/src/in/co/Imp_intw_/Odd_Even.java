package in.co.Imp_intw_;

import java.util.Scanner;

public class Odd_Even {
public static void main(String[] args) {
	int n ;
	System.out.println("Enter any number"); 
	Scanner obj = new Scanner(System.in);
	n=obj.nextInt();
	if (n%2==0) {
		System.out.println("Even number"); // 2,4,6,8
	} else {
		System.out.println("Odd number"); //3,5,7,9
	}
}
}

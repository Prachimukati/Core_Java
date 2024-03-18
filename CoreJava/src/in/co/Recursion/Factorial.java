package in.co.Recursion;

import java.util.Scanner;

public class Factorial {
	
public static void main(String[] args) {
	int n ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	n = sc.nextInt();
	Factorial f =new Factorial();
	int result = f.fact(n);
	System.out.println("Factorial of given number is= "+result);
}	
 	int fact(int  n) {
 		if (n==1) {
			return 1;
		} else {
			return n*fact(n-1);
		}
 		
 	}
	
}

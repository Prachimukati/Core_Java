package in.co.pract;

import java.util.Scanner;

public class Factorial_num {
public static void main(String[] args) {
	int n , fact=1 , i ;
	System.out.println("Enter any character");
	Scanner obj = new Scanner(System.in);
	n = obj.nextInt();
	for ( i =1; i <=n; i++) {
		fact = fact * i;
	}
	System.out.println("factorial of "+n+" is "+fact);
}
}

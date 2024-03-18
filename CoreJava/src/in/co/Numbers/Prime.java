package in.co.Numbers;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	int n , count=0; 
	System.out.println("Enter any number");
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();
	for (int i =1; i <=n; i++) {
		if (n%i==0) {
			count++;
		}
	}
		if (count==2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a prime number");
		}
}
}

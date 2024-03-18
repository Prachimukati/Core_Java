package in.co.Numbers;

import java.util.Scanner;

public class Square_Root {
public static void main(String[] args) {
	int n ;
	System.out.println("Enter any number");
	 Scanner obj = new Scanner(System.in);
	 n = obj.nextInt();
	 
	 double m=Math.sqrt(n);
	 System.out.println("Square root of " + m +" is "+m );
}
}

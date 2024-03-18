package in.co.pract;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	int num , i ; 
	System.out.println("Enter any character");
	Scanner obj = new Scanner(System.in);
	num = obj.nextInt();
	for ( i =1; i <=10; i++) {
		System.out.println(num + " * "+i + " = "+num * i);	
	}
}
}
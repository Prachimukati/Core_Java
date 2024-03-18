package in.co.pract;

import java.util.Scanner;

public class Power {
public static void main(String[] args) {
	int n ,p , result = 1;
	System.out.println("Enter any number");
	Scanner obj = new Scanner(System.in);
	n = obj.nextInt();
	System.out.println("Enter power");
	p = obj.nextInt();
	for (int i = 1; i <=p; i++) {
		result = result * n;
	}
	System.out.println("Power is "+result);
}
}

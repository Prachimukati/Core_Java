package in.co.Numbers;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	int n , c ,r , arm=0;
	System.out.println("Enter any number");
	 Scanner obj = new Scanner(System.in);
	 n = obj.nextInt();
	 c=n;
	 while (n>0) {
		r = n%10;
		arm = (r*r*r) + arm;
		n = n/10;
	}
	 if (c==arm) {
		System.out.println("Armstong number");
	} else {
		System.out.println("Not a Armstong number");

	}
}
}

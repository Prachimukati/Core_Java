package in.co.Numbers;

import java.util.Scanner;

public class Tribonacci_sereis {
public static void main(String[] args) {
	int a = 0 , b = 1 , c  = 2 , d , term;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Terms");
	term = sc.nextInt();
	for (int i = 1; i <=term; i++) {
		System.out.print(a+" ");
		d = c + a + b ;
		a = b ;
		b = c ;
		c = d;
	}
}
}

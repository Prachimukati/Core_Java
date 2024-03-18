package in.co.Numbers;

import java.util.Scanner;

public class Fiboncci_Sereis {  // means = 0 1 1 2 3 5 8 
public static void main(String[] args) {
	int a = 0 , b = 1 , c , term;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Terms");
	term = sc.nextInt();
	for (int i = 1; i <=term; i++) {
		System.out.print(a+" ");
		c = a + b ;
		a = b ;
		b = c ;
	}
}
}

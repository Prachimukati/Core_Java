package in.co.Imp_intw_;

import java.util.Scanner;

public class Sum_Digit {
public static void main(String[] args) {
	int n , r , sum = 0;
	 System.out.println("Enter any number");
	 Scanner obj = new Scanner(System.in);
	 n = obj.nextInt(); // 123
	 while (n>0) { // 123>0 ,12>0 ,  1>0
		r = n%10;  // 123%10 = 3 ,2 ,1
		sum = sum+r; // 0+3=3 , 3+2=5 , 5+1=6
		n = n/10; // 12,1,0
	}
	 System.out.println("Sum of digit " + sum);
}
}

package in.co.Imp_intw_;

import java.util.Scanner;

public class All_Odd_num {
public static void main(String[] args) {
	int n ;
	 System.out.println("Enter any number");
	 Scanner obj = new Scanner(System.in);
	 n = obj.nextInt();
	 for (int i = 1; i <=n; i=i+2) {
		System.out.println(i);
	}
	 
	 
}
}

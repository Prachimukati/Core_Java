package in.co.Imp_intw_;

import java.util.Scanner;

public class Swap_TwoVarbl {
public static void main(String[] args) {
	int a , b ;
	 System.out.println("Enter any number");
	 Scanner obj = new Scanner(System.in);
	 a = obj.nextInt();// a = 5
	 b = obj.nextInt(); // b = 10
	 System.out.println("Before swapping " + a+ " "+b); // a = 5 , b = 10
	 a = a + b; // a = 5+10 = 15
	 b = a - b;// b = 5-10 = 5
	 a = a - b; // a = 15-5 = 10
	 System.out.println("After swapping " + a+ " "+b); // a = 10 , b = 5 

}
}

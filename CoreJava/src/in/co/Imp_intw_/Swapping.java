package in.co.Imp_intw_;

import java.util.Scanner;

public class Swapping {
public static void main(String[] args) {
	int a , b ,temp ;
	 System.out.println("Enter two number");
	 Scanner obj = new Scanner(System.in);
	 a = obj.nextInt();//a = 10
	 b = obj.nextInt();// b = 20
     System.out.println("Before swapping " + a +" " +b);
     temp = a; // temp =10
	 a = b;   // a = 20
	 b = temp; // b= 10
	 System.out.println("After swapping " + a +" " + b);
	 
}
}

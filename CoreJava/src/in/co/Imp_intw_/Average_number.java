package in.co.Imp_intw_;

import java.util.Scanner;

public class Average_number {
public static void main(String[] args) {
	int a , b , c , d, e;
	System.out.println("enter any number");
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
	b = obj.nextInt();
	c = obj.nextInt();
	d = obj.nextInt();
	e = obj.nextInt();
	 int sum = a+b+c+d+e;
	 System.out.println("Total marks " + sum);
	 
	 double avg = sum/5;
	 System.out.println("Average " +avg);
}
}

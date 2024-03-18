package in.co.Imp_intw_;

import java.util.Scanner;

public class Salary {
public static void main(String[] args) {
	int sal;
	double tax;
	System.out.println("Enter salary");
	Scanner obj = new Scanner(System.in);
	sal = obj.nextInt();
	if (sal<=1000) {
		System.out.println(sal+"No tax ");
	}
	else if (sal>1000 && sal<=10000) {
		tax = sal*0.10;
		System.out.println(sal +" "+ tax);
	}
	else {
		tax = sal*0.20;
		System.out.println(sal +" "+ tax);
	
	}
}
}

package in.co.Imp_intw_;

import java.util.Scanner;

public class Power {
public static void main(String[] args) {
	int n , p , result=1;
	System.out.println("Enter No.");
	Scanner obj = new Scanner(System.in);
	n = obj.nextInt();
	System.out.println("Enter Power");
	p = obj.nextInt();
	for (int i = 1; i <=p; i++) {
		result = n * result ;
	}
	System.out.println("Power " + result);
}
}

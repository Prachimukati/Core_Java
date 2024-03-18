package in.co.Imp_intw_;

import java.util.Scanner;

public class Natural_number {
public static void main(String[] args) {
	int  n ,i ,sum=0;
	System.out.println("Enter any number");
	Scanner obj = new Scanner(System.in);
	n = obj.nextInt();
	for ( i = 1; i<=n; i++) {
		sum = sum + i;
	}
	System.out.println(sum);
}
}

package in.co.Imp_intw_;

import java.util.Scanner;

public class Sum_Natural_num {
public static void main(String[] args) {
	int  n , sum=0 ;
	System.out.println("Enter any number");
	Scanner obj = new Scanner(System.in);
	n = obj.nextInt();
	for ( int i = 0; i<=n; i++) {
		sum=sum +i;
	}
	System.out.println("Addition = " + sum);

}
}

package in.co.Imp_intw_;

import java.util.Scanner;

public class Count_Digit {
public static void main(String[] args) {
	int n, count = 0 ;
	System.out.println("Enter any number ");
	Scanner obj = new Scanner(System.in);
	n = obj.nextInt();
	while (n>0) {
		n = n/10;
		count++;
	}
	System.out.println(count);
}
}
// n =123 kya 123>0 true , 12>0 true 1>0 true;
// count = 0 ,n = 123/10 = 12 Now count = 1  , 12/10 = 1  count = 2, 1/10 = 0 count = 3;     ;

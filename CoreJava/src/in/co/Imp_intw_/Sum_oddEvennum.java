package in.co.Imp_intw_;
          // Print sum of Odd or Even in given number
import java.util.Scanner;

public class Sum_oddEvennum {
public static void main(String[] args) {
	// Even num = 10(0+2+4+6+8+10 = 30)
	// Odd num = 11 (1+3+5+7+9 = 36 )
	int n , i,sum=0 ;
	System.out.println("Enter any number ");
	Scanner obj = new Scanner(System.in);
	n = obj.nextInt();
	
	if (n%2==0) {
		for ( i = 0; i <=n; i=i+2) {
			sum = sum + i;
		}
		System.out.println("Sum of even num " + sum);
	} else {
		for ( i = 1; i <=n; i=i+2) {
			sum = sum + i;
		}
		System.out.println("Sum of Odd number"+sum);
	}
	
}
}

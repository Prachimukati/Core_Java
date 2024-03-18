package in.co.Imp_intw_;

import java.util.Scanner;

public class Factorial_num {
public static void main(String[] args) {
	int n , fact = 1;
	 System.out.println("Enter any number");
	 Scanner obj = new Scanner(System.in);
	 n = obj.nextInt();
	 for (int i =1; i <=n; i++) {
		fact = fact * i;
	}
	 System.out.println("Factorial number of "+n +" is "+ fact);
}
}
                  // DRY RUNf
// n >= 4, i = 1 
//Is n(4) is greater than i(1) = yes
// 1 * 1 = 1
// Is 4>=2 = yes
// 1 * 2 = 2
// Is 4>=3 = yes
//2 *3  =6 
// Is 4>=4 = yes
//6 *4  = 24


package in.co.Imp_intw_;

import java.util.Scanner;

public class Factor_num {   // Factor = input 10 ===> 1,2,5,10 
public static void main(String[] args) {
	int n;
	 System.out.println("Enter any number");
	 Scanner obj = new Scanner(System.in);
	 n = obj.nextInt();
	 for (int i =1; i <=10; i++) {
		 if (n%i==0) {
			System.out.println(i + " ");
		}
		
	}
}
}

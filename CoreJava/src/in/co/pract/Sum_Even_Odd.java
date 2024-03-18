package in.co.pract;

import java.util.Scanner;

public class Sum_Even_Odd {
public static void main(String[] args) {
	int  n ,sum = 0;
	System.out.println("Enter any number");
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();
    
		if (n%2==0) {
			for (int i = 0; i <=n; i=i+2) {
				sum = sum+i;
			}
			System.out.println("sum of even number"+sum);		
		} else {
			for (int i =1; i <=n; i=i+2) {
				sum = sum+i;
			}
			System.out.println("sum of odd number"+sum);
		} 
		}
	
}

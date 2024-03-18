package in.co.pract;

import java.util.Scanner;

public class Sum_Natural_num {
public static void main(String[] args) {
	int n ,i , sum =0;
	System.out.println("Enter any number");
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();
    for ( i =1; i <=n; i++) {
		sum = sum+i;
	}
    System.out.println(sum);
}
}

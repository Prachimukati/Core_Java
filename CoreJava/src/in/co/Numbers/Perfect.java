package in.co.Numbers;

import java.util.Scanner;

public class Perfect {
public static void main(String[] args) {
	int n , sum=0;
	System.out.println("Enter any number");
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();
	for (int i =1; i <n; i++) {
		if (n%i==0) {
			sum = sum+i;
		}
	}
	if (n==sum) {
		System.out.println("Perfect number");
	} else {
		System.out.println(" Not a Perfect number");
	}
}
}

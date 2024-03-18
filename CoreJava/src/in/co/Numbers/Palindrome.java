package in.co.Numbers;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	 int n ,c ,r ,s=0;
	 System.out.println("Enter any number");
	 Scanner obj = new Scanner(System.in);
	 n = obj.nextInt();//n=121
	 c=n; // c=121
	 while (n>0) {//121>0=true   , 12>0 ,  1>0
		r = n%10; //121%10=1, 12%10=2 , 1%10 = 1
		s = (s*10) + r;// 0+1=1 , 2+0=2, 1+0= 1
		n = n/10; // 12/10=12 , 1/10 , 0
	}
	 if (c==s) {
		System.out.println("Palindrome number");
	} else {
		System.out.println("Not Palindrome number");
	}
}
}

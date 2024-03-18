package in.co.pract;

import java.util.Scanner;

public class Vowel_Consonent {
public static void main(String[] args) {
	char n ; 
	System.out.println("Enter any charater");
	Scanner obj = new Scanner(System.in);
	n = obj.next().charAt(0);
	if (n=='a' || n=='e'|| n=='i'|| n=='o'|| n=='u') {
		System.out.println("Vowel");
	} else {
		System.out.println("Consonent");
	}
}
}

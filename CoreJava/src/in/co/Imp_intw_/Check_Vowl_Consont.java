package in.co.Imp_intw_;

import java.util.Scanner;

public class Check_Vowl_Consont {
public static void main(String[] args) {
	char ch ;
	System.out.println("Enter character");
	Scanner obj = new Scanner(System.in);
	ch = obj.next().charAt(4);
	
	if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		System.out.println("Vowel");
	}
	else {
		System.out.println("Consonent");

	}
}
}

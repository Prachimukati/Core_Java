package in.co.Imp_intw_;

import java.util.Scanner;

public class Upper_Lower_Alpha {
public static void main(String[] args) {
	char ch , ch2;
	System.out.println("Enter character");
	Scanner obj = new Scanner(System.in);
	ch=obj.next().charAt(0);// ch = P
	
	if (ch>='A' && ch<='Z') { // B>=A && B<=Z
		ch2 = Character.toLowerCase(ch);
		System.out.println("Lowercase " +ch2);
	} else {
		ch2 = Character.toUpperCase(ch);
		System.out.println("Uppercase" +ch2);
	}
}
}

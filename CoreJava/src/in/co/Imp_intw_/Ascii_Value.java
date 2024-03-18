package in.co.Imp_intw_;

import java.util.Scanner;

public class Ascii_Value {
public static void main(String[] args) {
	char ch ;
	System.out.println("Enter character");
	Scanner obj = new Scanner(System.in);
	ch = obj.next().charAt(0);
	
	int a = ch ;
	System.out.println("Ascii value of "+ch+" is " + a);
}
}

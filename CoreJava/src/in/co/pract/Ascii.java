package in.co.pract;

import java.util.Scanner;

public class Ascii {
public static void main(String[] args) {
	char ch ;
	System.out.println("Enter any character");
	Scanner obj = new Scanner(System.in);
	ch = obj.next().charAt(0);
	
	int a = ch;
	System.out.println("Acsii value of "+ch+" is "+ a);
}
}

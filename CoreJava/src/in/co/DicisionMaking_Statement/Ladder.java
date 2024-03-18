package in.co.DicisionMaking_Statement;

import java.util.Scanner;

public class Ladder {
public static void main(String[] args) {
	int marks ;
	System.out.println("Enter marks");
	Scanner obj = new Scanner(System.in);
	marks=obj.nextInt();
	if (marks>75) {
		System.out.println("A grade");
	} else if(marks>50){
		System.out.println("B grade");
	}
	else if(marks<33) {
		System.out.println("C grade");
	}
	else {
		System.out.println("Fail");
	}
}
}

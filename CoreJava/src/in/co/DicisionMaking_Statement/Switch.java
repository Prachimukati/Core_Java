package in.co.DicisionMaking_Statement;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	int a = 10 , b = 20 , ch;
	System.out.println(" Enter your choice ");
	Scanner obj = new Scanner(System.in);
	ch = obj.nextInt();
	switch (ch) {
	case 1:
		System.out.println("Sum "+ (a+b));
		break;
	case 2:
		System.out.println("Sub "+ (a-b));
		break;
	case 3:
		System.out.println("Mult "+ (a*b));
		break;
	case 4:
		System.out.println("Div "+ (a/b));
		break;
	default:
		System.out.println("Invalide choice");
		break;
	}
}
}

package in.co.Imp_intw_;

import java.util.Scanner;

public class Month {
public static void main(String[] args) {
	int n ;
	 System.out.println("Enter any number");
	 Scanner obj = new Scanner(System.in);
	 n = obj.nextInt();
	 switch (n) {
	case 1:
		System.out.println("January = 31 Days ");
		break;
	case 2:
		System.out.println("February = 28 Days");
		break;
	case 3:
		System.out.println("March = 31 Days");
		break;
	case 4:
		System.out.println("April = 30 Days");
		break;
	case 5:
		System.out.println("May = 31 Days");
		break;
	case 6:
		System.out.println("June = 30 Days");
		break;
	case 7:
		System.out.println("July = 31 Days");
		break;
	case 8:
		System.out.println("August = 31 Days");
		break;
	case 9:
		System.out.println("September = 30 Days");
		break;
	case 10:
		System.out.println("October = 31 Days");
		break;
	case 11:
		System.out.println("November = 30 Days");
		break;
	case 12:
		System.out.println("December = 31 Days");
		break;
	default:
		System.out.println("Invalide number");
		break;
	}
}
}

package in.co.Imp_intw_;
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	int n1, n2, ch , cal;
	System.out.println("Enter any number ");
	Scanner obj = new Scanner(System.in);
	n1 = obj.nextInt();
	n2 = obj.nextInt();
	System.out.println("Select Operation");
	ch = obj.nextInt();
	if (ch==1) {
		cal = n1 + n2;
		System.out.println("Addition " + cal);
	}
	else if (ch==2) {
		cal = n1 - n2;
		System.out.println("Substraction " + cal);
	}
	else if (ch==3) {
		cal = n1 * n2;
		System.out.println("Multilication " + cal);
	}
	else if (ch==4) {
		cal = n1 / n2;
		System.out.println("Division" + cal);
	}
	else {
		cal = n1 % n2;
		System.out.println("Remainder " + cal);
	}
}
}

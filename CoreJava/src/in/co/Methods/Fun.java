package in.co.Methods;

import java.util.Scanner;

public class Fun {
		int n1 , n2 , add , sub , mult , div , rem;
public static void main(String[] args) {
		Fun f = new Fun();
		f.Input();
		f.Processed();
		f.Output();
		
}
	void Input() { // to input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
	}
	void Processed() {
		add = n1 + n2 ;
		sub = n1 - n2 ;
		mult = n1 * n2 ;
		div = n1 / n2 ;
		rem = n1 % n2 ;
	}
	void Output() {
	System.out.println("Addition ="+add );
	System.out.println("Substraction ="+sub );
	System.out.println("multiplication ="+mult );
	System.out.println("Division ="+div );
	System.out.println("Remainder ="+rem );

	}
}

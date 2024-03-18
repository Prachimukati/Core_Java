package in.co.Interface;

import java.util.Scanner;

public interface Client {
	void Input();
	void Output();
}
class Developer implements Client{
	String name ; double salary ;
		 @Override
		 public void Input() {
			 Scanner r = new Scanner(System.in);
				System.out.println("Enter name :");
				name = r.nextLine();
				System.out.println("Enter salary :");
				salary = r.nextDouble();
		 }
		 @Override
	public void Output() {
		System.out.println(name + " " + salary);
	}
	
public static void main(String[] args) {
	Developer d = new Developer();
	d.Input();
	d.Output();
}
}

package in.co.Operator;

import java.util.Scanner;

public class Arithmatic {
public static void main(String[] args) {
	int a , b;
	System.out.println("Enter two number");
	Scanner obj = new Scanner(System.in);
	a=obj.nextInt();
	b=obj.nextInt();
	          //OR
        //	int a = 10;
       //	int b = 20;
	System.out.println("Addition "+(a+b));
	System.out.println("Substraction "+(a-b));
	System.out.println("Mult "+(a*b));
	System.out.println("Division "+(a/b));
	System.out.println("Qutient "+(a%b));
}
}
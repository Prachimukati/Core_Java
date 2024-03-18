package in.co.Shape;

import java.util.Scanner;

public class Area_Triangle {
public static void main(String[] args) {
	int l , b ,h ,area ;
	System.out.println("Enter three values ");
	Scanner obj = new Scanner(System.in);
	l = obj.nextInt();
	b = obj.nextInt();
	h = obj.nextInt();
	area = l*b*h ; 
	System.out.println("Area of triangle " +area);
}
}

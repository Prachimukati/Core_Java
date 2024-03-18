package in.co.Shape;

import java.util.Scanner;

public class Area_Rectangle {
public static void main(String[] args) {
	          // Area of Rectangle = Length * Breadth 
	int l , b , area ;
	System.out.println("Enter values for side ");
	Scanner obj = new Scanner(System.in);
	l = obj.nextInt();
	b = obj.nextInt();
	area = l * b;
	System.out.println("Area of rectangle " + area);
}
}

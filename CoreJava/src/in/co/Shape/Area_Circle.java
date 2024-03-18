package in.co.Shape;

import java.util.Scanner;

public class Area_Circle {
public static void main(String[] args) {
	    // Area of Circle = Pi * r * r
	final double pi = 3.14 , area ;
	int r ;
	System.out.println("Enter radius");
	Scanner obj = new  Scanner( System.in);
	r = obj.nextInt();
	area  = pi*r*r;
	System.out.println("Area of circle " + area);
}
}

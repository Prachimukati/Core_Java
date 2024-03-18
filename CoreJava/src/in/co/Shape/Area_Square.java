package in.co.Shape;

import java.util.Scanner;

public class Area_Square {
public static void main(String[] args) {
	int side , area ;
	System.out.println("Enter side");
	Scanner obj = new Scanner(System.in);
	side = obj.nextInt();
	area = side * side;
	System.out.println("Area of Square " +area);
}
}

package in.com.ABSTRACT;

public class Shape {

	  void area() {
		 System.out.println("Shape area....!");
	 }
}
 
  abstract class Rectangle extends Shape{
	void area () {
		System.out.println("Reactangle area......!");
	}
	abstract void width();
}
 
 class  Circle extends Shape{
	void area() {
		System.out.println("Circle area......!");
	}
}
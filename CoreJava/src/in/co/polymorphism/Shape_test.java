package in.co.polymorphism;

class Shape{
	void draw() {
		System.out.println("Can not say shape");
	}
}
class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Square shape");
	}
}
public class Shape_test {
public static void main(String[] args) {
	Shape r  = new Square();
	r.draw();
}
}

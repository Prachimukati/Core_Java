package in.com.ABSTRACT;

public class Test_Shape {
public static void main(String[] args) {
	
	Shape s = new Shape();
		s.area();
	
	
	Rectangle r = new Rectangle() {

		@Override
		void width() {
			System.out.println("Rectangle width....!");			
		}	
	};
	r.area();
	r.width();
	s.area();

   Circle c = new Circle();
   c.area();
	 
}  
}
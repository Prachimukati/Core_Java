package in.com.inheritance;

public class Demo_Elnc_Shop {
public static void main(String[] args) {
	Electronic e = new Electronic();
	e.setName("T.V");
	e.setPrice(25000);
	
	System.out.println(e.getName());
	System.out.println(e.getPrice());
	
	Shop s = new Shop();
	s.setName("Freez");
	s.setPrice(50000);
	e.setName("Washing machine");
	e.setPrice(40000);
	
	System.out.println(s.getName());
	System.out.println(s.getPrice());
	System.out.println(e.getName());
	System.out.println(e.getPrice());
}
}
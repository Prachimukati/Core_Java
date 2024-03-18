package in.com.comparator;
public class Animal{

	String name;
	String Eat_food;
	
	public Animal(String name,String Eat_food) {
		this.name = name;
		this.Eat_food = Eat_food;
	}
	@Override
	public String toString() {
		return name + " " + Eat_food;
	}
}

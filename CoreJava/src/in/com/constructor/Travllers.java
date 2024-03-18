package in.com.constructor;

public class Travllers {

	 String name;
	String place;
	
	public Travllers() {
		name = "Prachi";
		place = "Banglore";
	}
	public static void main(String[] args) {
		Travllers t = new Travllers();
		System.out.println(t.name+"\n"+t.place);
	}
}
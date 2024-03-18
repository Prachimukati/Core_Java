package in.com.inheritance;

public class Demo_Farmer_Worker {
public static void main(String[] args) {
	Farmer f = new Farmer();
	f.setSeed("Rice");
	f.setPrice(50000);
	
	System.out.println(f.getPrice());
	System.out.println(f.getSeed());
	
	Worker w = new Worker();
	w.setName("Shamu");
	w.setSalary(250);

	System.out.println(w.getName());
	System.out.println(w.getSalary());
}
}

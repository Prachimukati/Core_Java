package in.com.Deep_Cloning;

public class Employee implements Cloneable{
	String name;
	int id;
	
	public Employee(String name,int id) {//
		 this.name = name;
		 this.id = id;
	}
	@Override
	public String toString() {
		
		return name + " " + id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}

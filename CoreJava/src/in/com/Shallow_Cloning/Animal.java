package in.com.Shallow_Cloning;

public class Animal implements Cloneable{
	String name;
	
	
	public Animal( String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}

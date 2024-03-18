package in.com.Shallow_Cloning;

public class Student implements Cloneable{
	int roll;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}

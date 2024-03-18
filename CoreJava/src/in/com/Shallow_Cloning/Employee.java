package in.com.Shallow_Cloning;

public class Employee implements Cloneable{

	String emp_name;
	int emp_id;
	
	public Employee(String emp_name,int emp_id) {
		this.emp_name  = emp_name;
		this.emp_id = emp_id;
	}
	@Override
	public String toString() {
		
		return emp_name+" "+emp_id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}

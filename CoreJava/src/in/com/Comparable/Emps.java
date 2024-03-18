package in.com.Comparable;

public class Emps implements Comparable<Emps>{
	String name;
	 String address;
	 int salary;
	
	public Emps(String name , String address , int salary) {
		this.address=address;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		
		return name+" "+address+" "+salary;
	}
	
@Override
public int compareTo(Emps o) {
	// TODO Auto-generated method stub
	return this.salary - o.salary;
}
}


package in.com.Shallow_Cloning;

public class Test_Emp {
public static void main(String[] args) throws CloneNotSupportedException {
	Employee e1 = new Employee("prachi",7);

	Employee e2 = (Employee) e1.clone();
	e2.emp_name = "bhavna";
	e2.emp_id = 3;
	
	System.out.println(e1);
	System.out.println(e2);
}
}

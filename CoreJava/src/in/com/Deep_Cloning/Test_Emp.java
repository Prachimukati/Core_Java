package in.com.Deep_Cloning;

public class Test_Emp {
public static void main(String[] args) throws CloneNotSupportedException {
	Employee e1  = new Employee("sonali", 9);
	Employee e2 = (Employee) e1.clone();
	e2.id = 7;
	e2.name = "Dipanshi";
	System.out.println(e1);
	System.out.println(e2);
}
}

package in.co.pract;
class Employee {
	int Salary ;
	String Name ;
	String Occupation ;
	public Employee() {
		Name = "Prachi" ;
		Salary  = 200000 ;
		Occupation = "Coder" ; 
		System.out.println(Name+" "+Salary+" "+Occupation );
	}
	public Employee(String name) {
		Name = "Prachi" ;
		Salary  = 200000 ;
		Occupation = "Coder" ; 
		System.out.println(Name+" "+Salary+" "+Occupation );
		System.out.println(name);
	}
}
class Test_Employee{
public static void main(String[] args) {
	Employee e = new Employee();
	Employee e1 = new Employee("chand");

}
}
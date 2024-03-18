package in.com.Setter_GetterMethod;

public class Employee {

	private String name;
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("prachi");
		e.setAge(20);
		
		System.out.println(e.getAge());
		System.out.println(e.getName());
	}
}

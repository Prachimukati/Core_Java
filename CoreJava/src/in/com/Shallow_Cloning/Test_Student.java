package in.com.Shallow_Cloning;

public class Test_Student {
public static void main(String[] args) throws CloneNotSupportedException {
	Student obj1 = new Student();
	obj1.roll = 1;
	Student obj2 = (Student) obj1.clone();
	obj2.roll = 5;
	System.out.println(obj1.roll);
	System.out.println(obj2.roll);
}
}

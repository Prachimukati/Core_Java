package in.com.Shallow_Cloning;


public class Test_Animal {
public static void main(String[] args) throws CloneNotSupportedException {
	Animal an1 = new Animal("Dog");
	
	Animal an2 = (Animal) an1.clone();
	an2.name = "Cat";
	
	
	System.out.println(an1);
	System.out.println(an2);
		
}
}

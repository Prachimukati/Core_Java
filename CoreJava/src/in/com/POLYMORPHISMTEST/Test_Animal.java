package in.com.POLYMORPHISMTEST;

public class Test_Animal {
public static void main(String[] args) {
	Animal a = new Animal();
	a.sound();
	
	Dog d = new Dog();
	d.sound();
	a.sound();
	
	Lion l = new Lion();
	l.sound();
	a.sound();
	d.sound();
}
}

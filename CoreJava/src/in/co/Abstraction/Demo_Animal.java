package in.co.Abstraction;

abstract class Animal {
	Animal(){
		System.out.println("All animal....");
	}
	public abstract void sound();
}

class Dog extends Animal {

	Dog() {
		super();
	}

	@Override
	public void sound() {
		System.out.println("Dog is Barking");
	}
}

class Lion extends Animal {

	Lion() {
		super();
	}

	@Override
	public void sound() {
		System.out.println("Lion is Roar");
	}
}

public class Demo_Animal {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		Lion l = new Lion();
		l.sound();
	}
}
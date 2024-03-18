package in.co.Abstraction;

abstract class Praogramming {
	public abstract void Developer();
	// public abstract void Rank();

}
class HTML extends Praogramming {

	@Override
	public void Developer() {
		System.out.println("Tim Berners Lee");
	}

//	@Override
//	public void Rank() {
//		System.out.println("3rd");
//	}	  
}
class Java extends Praogramming {

	@Override
	public void Developer() {
		System.out.println("James Gosling");
	}
}

public class Test_Praogramming {
	public static void main(String[] args) {
		Praogramming p = new HTML();
//		p.Developer(); // p.Rank();
		Praogramming p1 = new Java();
		p1.Developer();// p1.Rank();
		
	}
}
package in.co.Interface;

interface Gill{
	void add();
}
interface Raj extends Gill{
	void sub();
}
class Ankit implements Raj{

	@Override
	public void add() {
		int a = 10 , b = 20 , c;
		c = a + b;
		System.out.println("Add ="+c);
	}

	@Override
	public void sub() {
		int a = 10 , b = 20 , c;
		c = a - b;
		System.out.println("Sub ="+c);		
	}
	
}
public class Test_Mdhu {
public static void main(String[] args) {
	Raj r = new Ankit();
	r.add();
	r.sub();
}
}

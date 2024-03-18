package in.co.Interface;

interface A {
	void Show();
}

interface B {
	void Show();
}

//interface B {
//	void Disp();
//}

public class Multiple_Inhrt implements A, B {
	@Override
	public void Show() {
		System.out.println("Interface A");
	}

//	@Override
//	public void Disp() {
//		System.out.println("Interface B");
//	}

	public static void main(String[] args) {
		Multiple_Inhrt r = new Multiple_Inhrt();
		r.Show();
		//r.Disp();
	}

}

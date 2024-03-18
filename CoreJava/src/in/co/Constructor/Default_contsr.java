package in.co.Constructor;

class A{
	int a ; String b ; boolean c;
	A(){ // DEFAULT CONSTRUCTOR
		a = 10 ; b = "Prachi" ; c = true;
	}
	void show() {
		System.out.println(a+" "+b+" "+c);
	}
}

public class Default_contsr {
public static void main(String[] args) {
	A ref  = new A();
	ref.show();
}
}

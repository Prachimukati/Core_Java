package in.co.Constructor;

class Parmtz{
	int x ,y;
	Parmtz(int a , int b){ // Parameterize constructor
		x = a ; y = b;
//		System.out.println(a+" "+b);
	}
	Parmtz(int a, boolean b ){
		System.out.println(a+" "+b);
	}
	Parmtz(String c , int d){
		System.out.println(c+" "+d);
	}
	void show() {
		System.out.println(x+" "+y);
	}
}
public class Parameterize_constr {
public static void main(String[] args) {
	Parmtz ref = new Parmtz(100,200);
	ref.show();
	Parmtz r = new Parmtz(100,true);
	Parmtz r1 = new Parmtz("Prachi",1000);

}
}

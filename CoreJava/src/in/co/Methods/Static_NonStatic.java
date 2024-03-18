package in.co.Methods;

public class Static_NonStatic {
	int a =10;
	static int b = 20;
public static void main(String[] args) {
	Static_NonStatic sn = new Static_NonStatic();
	sn.Disp();
	Static_NonStatic.Add();
}
	void Disp() {
		System.out.println(" Disp "+(a+b));
	}
	 static void Add() {
		System.out.println(" Add "+b);
	}
}


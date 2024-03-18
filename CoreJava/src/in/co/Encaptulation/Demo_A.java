package in.co.Encaptulation;

class A{
	private int value;
	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
public class Demo_A {
public static void main(String[] args) {
	A r = new A();
	r.setValue(100);
	System.out.println(r.getValue());
}
}

package in.com.Interface;

public class Test_Buisnessman implements  Socialworker{

	@Override
	public void helptoOther() {
		System.out.println("help to other");
		
	}

	@Override
	public void donation() {
		System.out.println("donate money");
		
	}

	@Override
	public void party() {
		
		System.out.println("gives party");
		
	}

	@Override
	public void earnmoney() {
		System.out.println("earn money");
		
	}
	public static void main(String[] args) {
		Test_Buisnessman b=new Test_Buisnessman();
		b.party();
		b.donation();
		b.earnmoney();
		b.helptoOther();
	}
}

package in.co.pract;
abstract class Richman{
	public abstract void Bankbalance(); 
	public void Collection() {
		System.out.println("Collection of Cars");
	}
}
abstract class Middle_People{
	public abstract void Bankbalance(); 
	public void Collection() {
		System.out.println("Did not have any Collection  ");
	}
}
public class Test_RM {
public static void main(String[] args) {
	Richman r = new Richman() {
		
		@Override
		public void Bankbalance() {
			System.out.println(20000000);
		}
	};
	r.Bankbalance();
	Middle_People mp = new Middle_People() {
		
		@Override
		public void Bankbalance() {
			System.out.println(20000);
		}
	};
	mp.Bankbalance();
}
}

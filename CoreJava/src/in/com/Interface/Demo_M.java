package in.com.Interface;

public class Demo_M implements Laptop , Mobile{
		
		@Override
		public void name() {
			System.out.println("Asus");	
		}
		@Override
		public void price() {
			System.out.println(65000);
		}
		@Override
		public void storage() {
			System.out.println(128);
		}
		@Override
		public void Mg() {
			System.out.println(108);
		}
		public static void main(String[] args) {
			Demo_M d = new Demo_M();
			d.name();
			d.price();
			d.storage();
			d.Mg();
		}
	}


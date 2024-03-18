package in.co.Exception;

public class ThrowsDemo {
public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
//{		OR
//	for (int i = 0; i <=10; i++) {
//		try {
//			System.out.println(i);
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
//	}
}
}

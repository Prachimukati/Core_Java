package in.co.Looping;

public class Nested_loop {
public static void main(String[] args) {
	int i , j;
	for ( i =1; i <=5; i++) {  // ROW
		for ( j =1; j<=5; j++) {  // COLOUM
			System.out.print("* ");
		}
		System.out.println();
	}
}
}

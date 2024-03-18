package in.com.Do_whileLoop;

public class Odd_number {
public static void main(String[] args) {
	
	int i = 0;
	do {
		if(i%2==0) {
			System.out.println("Odd number " + " "+i);
		}
		i++;
	}
	while (i<10);
}
}
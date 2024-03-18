package in.com.intewie;

public class Count_alphabet {
public static void main(String[] args) {
	String name = " prachimukati@gmail.com";
	int count = 0;
	for (char ch = 'a'; ch<='z'; ch++) {
			for (int i = 0; i <name.length(); i++) {
				if (name.charAt(i)==ch) {
					count++;
				}
			}
		
	}
	System.out.println(count);
}
}
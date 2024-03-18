package in.co.Imp_intw_;
                 // PRINT CHARACTER BY USER
import java.util.Scanner;

public class Character_input {
public static void main(String[] args) {
	char ch ;
	System.out.println("Enter character");
	Scanner obj = new Scanner(System.in);
	ch=obj.next().charAt(0);
	System.out.println(ch);
}
}

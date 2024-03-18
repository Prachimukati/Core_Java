package in.co.Imp_intw_;

import java.util.Scanner;

public class Add_number {
public static void main(String[] args) {
	int  i , j , sum ;
	System.out.println("Enter two number");
	Scanner obj = new Scanner(System.in);
	i = obj.nextInt();
	j = obj.nextInt();
	
	sum = i + j ;
	System.out.println("Addition = " +sum);
}
}

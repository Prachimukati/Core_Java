package in.co.Imp_intw_;

import java.util.Scanner;

public class Reverse_num {
public static void main(String[] args) {
	int i , r ;
	 System.out.println("Enter any number");
	 Scanner obj = new Scanner(System.in);
	 i = obj.nextInt(); // i=123
	 while (i>0) { // 123>0 , 12>0,1>0
			 r = i%10; // 123%10=3, 12%10=2  ,1%10=1  
				System.out.println(r);	// 321
			i = i/10; // 12,1,0
		i--;
	}
}
}

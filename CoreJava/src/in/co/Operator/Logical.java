package in.co.Operator;

public class Logical {
public static void main(String[] args) {
	       // && operator = BOTH CONDITION IS TRUE  // 
	
	System.out.println((10>1) && (2>1)); //True
	System.out.println((10>1) && (2<1)); //False
	System.out.println((10<1) && (2<1)); // False
	  // || Operator = IF ONE CONDIOTION IS TRUE. SO IT PRINT TRUE //
	
	System.out.println((10>1) || (2>1)); //True
	System.out.println((10>1) || (2<1)); //True
	System.out.println((10<1) || (2<1)); // False
	 // ! Operator = IF CONDITION IS TRUE IT PRINT FALSE  //
	
	System.out.println(!(10>1)); //False
	System.out.println(!(10>1)); //False
	System.out.println(!(10<1)); //True
}
}

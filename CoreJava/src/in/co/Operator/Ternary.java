package in.co.Operator;

public class Ternary {
public static void main(String[] args) {
	int a = 10 , b = 20 , max;
	max = (a<b)? a:b; // ? = IS 'A' IS GRETER THAN 'B' =  no SO, 
	                   //: = IT WORKS LIKE 'ELSE' = b is print
	
//	int a =10 , b= 20 , c = 25 , max;
//	max = (a>b)? (a>c ? a:c ) : (c>b ? c:b);
	System.out.println(max);
}
}

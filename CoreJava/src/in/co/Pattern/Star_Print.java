package in.co.Pattern;

public class Star_Print {
public static void main(String[] args) {
	int i , j;
	for(i=1;i<=5;i++) // Rows
	{
		for(j=1;j<=i;j++){ // Coloum for Reverse=(j=5;j>=i;j--)
			System.out.print("*");
		}
		System.out.print(" \n");
	}
	
	
}
}

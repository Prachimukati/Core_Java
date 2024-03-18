package in.co.Array;

import java.util.Scanner;

public class Dynamic_array {
public static void main(String[] args) {
	int size ;
	System.out.println("Enter Size");
	Scanner obj = new Scanner(System.in);
	size= obj.nextInt();
	int a[] = new int [size];
    
	for (int i = 0; i <size; i++) {
    	a[i]= obj.nextInt();// Values enter in array
    }
   
    System.out.println("Printed element ");
   
    for (int i = 0; i <size; i++) {
        System.out.println(a[i]+" ");// The values which we entered is printed
    }  
}
}

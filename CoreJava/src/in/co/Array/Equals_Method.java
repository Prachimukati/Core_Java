package in.co.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Equals_Method {
public static void main(String[] args) {
	int a[] = new int [5];
	int a2[] = new int [5];
	Scanner sc = new Scanner(System.in);
	boolean b = Arrays.equals(a, a2);
	System.out.println("Both are eyual " +b);
}
}

package in.com.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Test_Student {
public static void main(String[] args) {
	ArrayList<Student> std = new ArrayList<Student>();
	std.add(new Student("prachi",5));
	std.add(new Student("siya" ,2));
	std.add(new Student("Kayu" ,3));
	
	System.out.println(std);
	Collections.sort(std);
	System.out.println(std);
}
}


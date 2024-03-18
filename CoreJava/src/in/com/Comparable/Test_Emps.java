package in.com.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Emps {
	public static void main(String[] args) {
	ArrayList<Emps> marks =new ArrayList<>();
	marks.add(new Emps("prachi","Indore",5));
	marks.add(new Emps("chand", "Kedwa",2));
	System.out.println(marks);
	
	Collections.sort( marks);
	System.out.println(marks);
	
}
}

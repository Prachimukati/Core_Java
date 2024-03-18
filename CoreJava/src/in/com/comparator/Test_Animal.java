package in.com.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import in.com.Collections.CollectionSort;

public class Test_Animal {
public static void main(String[] args) {
	ArrayList<Animal>an = new ArrayList<Animal>();
	an.add(new Animal("Dog","Bones"));
	an.add(new Animal("cat","milk"));
	
	System.out.println(an);
	//Collections.sort(an);
	
}
}

package in.com.Comparable;

public class Student implements Comparable<Student>{
	String name;
	int id;
	
	public Student(String name , int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return name + " " +id;
	}
	@Override
	public int compareTo(Student o) {
		return id - o.id;
	}
}

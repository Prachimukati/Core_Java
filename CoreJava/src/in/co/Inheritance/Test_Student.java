package in.co.Inheritance;

class Student { // Super Class
	int roll, marks;
	String name;

	void Show() {
		System.out.println("Enter roll name & marks");
	}
}

class Test_Student extends Student { // Sub Class

	void disp() {
		roll = 1;
		name = "prachi";
		marks = 99;
		System.out.println(roll + " " + name + " " + marks);
	}

	public static void main(String[] args) {
		Test_Student st = new Test_Student();
		st.Show();
		st.disp();
	}
}
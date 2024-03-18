package in.com.inheritance;

public class Shop extends Electronic{
	String name;
	int size;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
}

package in.co.FileHandling;

import java.io.File;
import java.io.IOException;

public class Create_file {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\rk163\\Desktop\\java Stream\\Chandu.txt");
	if (f.createNewFile()) {
		System.out.println("New file created");
	} else {
		System.out.println("File does not create");
	}
}
}

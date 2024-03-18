package in.co.FileHandling;

import java.io.File;
import java.io.IOException;

public class Rename_File {
public static void main(String[] args) throws IOException {
 	File f = new File("C:\\Users\\rk163\\Desktop\\java Stream\\Chandu.txt");
 	File r = new File("C:\\Users\\rk163\\Desktop\\java Stream\\Lali.txt");
 	
 	if (f.exists()) {
		System.out.println(f.renameTo(r));
	}
 	else {
		System.out.println("File does not exist");
	}
}
}

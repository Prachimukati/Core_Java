package in.co.FileHandling;

import java.io.File;

public class Info_File {
public static void main(String[] args) {
	File f = new File("C:\\Users\\rk163\\Desktop\\java Stream\\Chandu.txt");
	if (f.exists()) {
		System.out.println("File Name: " +f.getName());
		System.out.println("File Location: " +f.getAbsolutePath());

		System.out.println("File Writeable: " +f.canWrite());

		System.out.println("File Readable: " +f.canRead());

		System.out.println("File Size: " +f.length());
	//	System.out.println("File Remove: " +f.delete());


	}
	else {
		System.out.println("File Does not exist");
	}
}
}

package in.co.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_File {
public static void main(String[] args) throws IOException {
	FileInputStream r = new FileInputStream("C:\\Users\\rk163\\Desktop\\java Stream\\prachi.txt");
	FileOutputStream w = new FileOutputStream("C:\\Users\\rk163\\Desktop\\java Stream\\Lali.txt");
	
	int  i ;
	while ((i=r.read())!=-1) {
		w.write((char)i);
	}
	System.out.println("Data copied successfully....");
}
}

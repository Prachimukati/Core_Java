package in.co.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File {
public static void main(String[] args) throws IOException {
//	try {
//     	FileReader r = new FileReader("C:\\Users\\rk163\\Desktop\\java Stream\\Chandu.txt");
//     	try {
//     		int i ;
//     		while ((i=r.read())!=-1) {
//			System.out.println((char)i);
//		}
//		} finally {
//			
//	     		r.close();
//	    	
//		}
//    	System.out.println("Data Read sucessufully");
//
//	} catch (Exception e) {
//		System.out.println(e);
//	}
	FileReader r = new FileReader("C:\\Users\\rk163\\Desktop\\java Stream\\prachi.txt");
	int i ;
	while ((i=r.read())!=-1) {
		System.out.println((char)i);
	}
	System.out.println("Data read successfully");
}
}

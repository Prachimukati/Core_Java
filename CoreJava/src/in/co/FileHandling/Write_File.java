package in.co.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_File {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("C:\\Users\\rk163\\Desktop\\java Stream\\Chandu.txt");
	fw.write("Hello guys...");
	fw.close();
	System.out.println("Data write sucessfully");
	
//	try {
//     	FileWriter fw = new FileWriter("C:\\Users\\rk163\\Desktop\\java Stream\\Chandu.txt");
//     	try {
//			fw.write("hello");
//		} finally {
//			
//	     		fw.close();
//	    	
//		}
//     	System.out.println("Data write sucessufully");
//
//	} catch (Exception e) {
//		System.out.println(e);
//	}
}
}

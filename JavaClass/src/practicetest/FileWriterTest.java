package practicetest;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw;
		FileOutputStream fos;
		BufferedOutputStream bos;
				
		try {
			fw = new FileWriter("C:\\Program Files\\Java\\Workspace\\JavaClass\\src\\practicetest\\Java.txt");
			fw.write("This is a test file written using filewriter");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fos = new FileOutputStream("C:\\Program Files\\Java\\Workspace\\JavaClass\\src\\practicetest\\Java.txt");
			String input = "This is a test file written using filewriter";
			byte [] text = input.getBytes();
			fos.write(text);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}

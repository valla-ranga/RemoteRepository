package practicetest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	static FileReader fr;
	static FileInputStream fis;
	static BufferedInputStream bis;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== FR==========");
		
	
		try {
			fr = new FileReader("C:\\Users\\ranganath\\Documents\\java.txt");
			int data = fr.read();
			while(data != -1)
			{
				System.out.print((char)data);
				data = fr.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("===== FIS==========");
		try {
			fis = new FileInputStream("C:\\Users\\ranganath\\Documents\\java.txt");
			int data1 = fis.read();
			while(data1 != -1)
			{
				System.out.print((char)data1);
				data1 = fis.read();
			}
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("===== BIS==========");
		try {
			bis = new BufferedInputStream(fis);
			int data2;
			data2 = bis.read();
			while(data2 != -1)
			{
				System.out.print((char)data2);
				data2 = bis.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis;
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\ranganath\\Documents\\java.txt");
			bis = new BufferedInputStream(fis);
			int data = bis.read();
			while (data != -1)
			{
				System.out.print((char)data);
				data = bis.read();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}

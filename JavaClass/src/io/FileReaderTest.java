package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		
		try {
			fr = new FileReader("C:\\Users\\ranganath\\Documents\\java.txt");
			BufferedReader br = new BufferedReader(fr);
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
		
		

	}

}

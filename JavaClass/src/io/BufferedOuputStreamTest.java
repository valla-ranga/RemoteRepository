package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOuputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		
		try {
			fos = new FileOutputStream("javaa.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			String content = "This is written using Bufferedoutputstream method";
			byte []text = content.getBytes();
			bos.write(text);
			bos.flush();
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package io;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ranganath\\Documents");
		File[] files = file.listFiles();
		for(File f:files)
		{
			System.out.println(f.getName());
		}

	}

}

package io;

import java.io.File;
import java.io.FilenameFilter;

public class FilterFilesExtensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ranganath\\Documents");
	        String[] files = file.list(new FilenameFilter() {
	             
	            @Override
	            public boolean accept(File dir, String name) {
	                if(name.toLowerCase().endsWith(".pdf")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(String f:files){
	            System.out.println(f);
	        }

	}

}

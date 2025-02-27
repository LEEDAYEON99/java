package iosercive;

import java.io.File;
import java.text.SimpleDateFormat;

public class DirList2 {

	public static void main(String[] args) {
		
		String dirPath="C:\\Program Files (x86)\\Google\\GoogleUpdater";
		File dir = new File(dirPath);
	
		File[] names = dir.listFiles();
		SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD");
		for(int i=0; i<names.length; i++) {
			String str = "<폴더>";
			if(names[i].isDirectory()) { 
				
				String name = names[i].getName();
				int len = (int)names[i].length();
				long unix = names[i].lastModified();
				String date = df.format(unix);
				int len2 = len/1024;
				System.out.println(str+" "+name+" "+len2+" "+date);
			}
			
		
		}
	
		for(int i=0; i<names.length; i++) {
			
			//if(!names[i].isDirectory())
			if(names[i].isDirectory() == false) { 
				String str="[파일]";
				String name = names[i].getName();
				int len = (int)names[i].length();
				long unix = names[i].lastModified();
				String date = df.format(unix);
				int len2 = len/1024;
				System.out.println(str+" "+name+" "+len2+" "+date);
			}
			
			
			
		
		}

	}

}

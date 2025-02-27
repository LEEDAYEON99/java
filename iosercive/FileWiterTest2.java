package iosercive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWiterTest2 {

	public static void main(String[] args) throws Exception {
	
	String filePath="c:/mytemp/test2.txt";
	
	Scanner scn = new Scanner(System.in);
	System.out.print("내용입력>>");
	String txt =  scn.next();
	
		FileWriter fw = new FileWriter(filePath,true);
		fw.write(txt+"\n");
		fw.close();


		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		while(true) {
			String str = buffer.readLine();
			if(str == null) break;
			System.out.println(str);}
		
		buffer.close();
		file.close();
}

}

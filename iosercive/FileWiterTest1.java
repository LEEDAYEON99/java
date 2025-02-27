package iosercive;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWiterTest1 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		
		
		String filePath="c:/mytemp/test.txt";
		try {
			//FileWriter(경로,구분) 구분:덮어쓰기(false),이어쓰기(true)
			FileWriter fw = new FileWriter(filePath,true);
			System.out.print("내용입력>>");
			String txt =scn.next();
			fw.write(txt+"\n");
			fw.close();
			System.out.println("쓰기완료");
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}

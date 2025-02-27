package iosercive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyTest1 {

	public static void main(String[] args) throws Exception {
		
		String filePath1 = "c:/mytemp/Test1.java";
		String filePath2 = "c:/mytemp/Test1.java.bak";
		
		//filePath1 읽어들임 출력 
		//출력내부에 write()기능을 넣음
		
		FileReader file = new FileReader(filePath1);
		BufferedReader buffer = new BufferedReader(file);
		FileWriter fw = new FileWriter(filePath2,true);
		
		while(true) {
			String str = buffer.readLine();
		
			if(str==null)break;
		
			fw.write(str+"\n");
		}
		
		fw.close();
		buffer.close();
		file.close();
		
		System.out.println("내용카피완료");
	}

}

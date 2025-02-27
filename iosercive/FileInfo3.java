package iosercive;

import java.io.File;
import java.util.Scanner;

/*
 * 파일생성관련실습
 */
public class FileInfo3 {


	public static void main(String[] args) {
		//디렉토리(리눅스용어)
		String dirPath="C:/mytemp";
		Scanner scn =new Scanner(System.in);
		System.out.print("(new)파일명>>");
		String filename = scn.next();
		String filePath = dirPath+"/"+filename;
		
		File file = new File(filePath);
		if(file.exists()) {
			System.out.println("이미존재함");
		}else {
			try {
				file.createNewFile();
				System.out.println("생성성공");
				
			}catch(Exception e) {
				//부정확한 경로 (특히 폴더명) 설정시 발생
				System.out.println("생성실패");
			}
		
		}
		
	}

}

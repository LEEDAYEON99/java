package iosercive;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MyFileAdmin {
	public static String dirpath="C:\\mytemp";
	
	public static void main(String[] args) {
		
		String dirpath="C:\\mytemp";
		Scanner scn = new Scanner(System.in);
		
		System.out.println("[파일관리]\n");
		System.out.println("(1) 목록출력  (2) 파일생성  (3) 파일삭제");
		
		System.out.println("*메뉴번호>>");
		
		byte menu =0;
		try {
			menu = scn.nextByte();
		}catch(Exception e) {
			System.out.println("번호로 입력해주세요");
			return;
		}

		switch(menu){
			case 1 :MyFileAdmin.dirList();
			break;
			case 2 :MyFileAdmin.createFile();
			break;
			case 3 :MyFileAdmin.deleteFile();
			break;
			default: System.out.println("없는 메뉴번호 입니다");
		}
		
	}

	public static void dirList() {
		
		
		File dir = new File(dirpath);
		
		File[] names = dir.listFiles();
		
		SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD");
		
		
		
		for(int i=0; i<names.length; i++) {
			
			String str = "[파일]";
			if(names[i].isDirectory()) { 
				str="<폴더>";
			}
			String name = names[i].getName();
			int len = (int)names[i].length();
			long unix = names[i].lastModified();
			String date = df.format(unix);
			int len2 = len/1024;
			System.out.println(str+" "+name+" "+len2+" "+date);}
		
		if(names.length==0) {
			System.out.println("출력내용이 없습니다.");
		}	
		
	}
	public static void createFile() {
		
		Scanner scn =new Scanner(System.in);
		System.out.print("(new)파일명>>");
		String filename = scn.next();
		String filePath = dirpath+"/"+filename;
		
		File file = new File(filePath);
		if(file.exists()) {
			System.out.println("이미존재함");
		}else {
			try {
				file.createNewFile();
				System.out.println("생성성공");
				dirList();
				
			}catch(Exception e) {
				
				System.out.println("생성실패");
			}	
		}
	}
	public static void deleteFile() {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("(삭제) 파일명>>");
		String filename = scn.next();
		String filePath = dirpath+"/"+filename;
		
		File file = new File(filePath);
		
		if(file.exists()) {
		
			file.delete();
			
			System.out.println("삭제완료");
			
		}else {
				System.out.println("존재하지않음");
			}
	}
}

package iosercive;

import java.io.File;
import java.util.Scanner;

/*	
 * 파일삭제 실습2 (삭제여부 물어봄)
 */
public class FileInfoDelete2 {

	public static void main(String[] args) {
		
		String dirPath = "c:/mytemp";
		Scanner scn = new Scanner(System.in);
		System.out.print("(삭제) 파일명>>");
		String filename = scn.next();
		String filePath = dirPath+"/"+filename;
		
		File file = new File(filePath);
		
		int fileLen = (int)file.length();
		
		if(fileLen > 0) {
			while(true)  {
				System.out.println("빈파일이 아닙니다. 삭제하시겠습니까?(예:Y, 아니오:N)>>");
				String yn = scn.next();
				if (yn.toUpperCase().equals("Y")) {
					System.out.println("삭제 진행 하였습니다.");
					break;
					
				}else if (yn.toUpperCase().equals("N")) {
					System.out.println("삭제 취소가 되었습니다");
					return;//메소드 종료
					
				}else {
					System.out.println("Y 또는 N을 입력해주세요.");
				}
			}
		}
		
	
		
		if(file.exists()) {
		
			file.delete();
			
			System.out.println("삭제완료");
		}else {
				System.out.println("존재하지않음");
			}
		

	}

}

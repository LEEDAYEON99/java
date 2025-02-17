package study0214;

public class Exam0214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println();
		System.out.println("============");
		double ret1 =method2(30,50);
		System.out.println(ret1);
		System.out.println(method2(30,50));
		System.out.println("============");
		String jumin="880214-1023456";
		method3(jumin); 
		System.out.println("============");
		System.out.println("나이"+method4(jumin));
		System.out.println("============");
		boolean bn = method5(jumin);
		if(bn == true) {
			System.out.println("올바른 주민번호입니다.");
		}else {
			System.out.println("날짜가 잘못된 주민번호입니다.");
		}
		System.out.println("============");
		String str="01022227777,12346789,01012356,01056427896";
		String result = method6(str);
		System.out.println("잘못된데이터:"+result);
		
		
	}
	public static void method1() {
		int i = 0;
		while(i<=9) {
			System.out.print(i +" ");
			i++;
		}
	}
	
	public static double method2(int a, int b) {
		int hap = a+b;
		double result = (double)hap/2;
		return result;
	}
	
	
	
	public static void method3(String jumin) {
		//String jumin = "890503-1234567";
		String [] array =jumin.split("-");
		
		String s1="정상";
		String s2="정상";
		String s3="정상";

		if(array[0].length() != 6) {
			s1="비정상";
		}else {
			
		}
		if(array[1].length() != 7) {
			s2="비정상";
		}else {
			
		}

		String gender =array[1].substring(0,1);
		if(Integer.parseInt(gender)<1 || Integer.parseInt(gender)>4 ) {
			s3="비정상";
		}else {
			
		}
		
		
		
		System.out.println("앞번호 "+s1);
		System.out.println("뒷번호 "+s2);
		System.out.println("성별 "+s3);
		
	}
	public static int method4(String jumin) {
		String str1 = jumin.substring(0, 2);
		String gender = jumin.substring(7,8);
		
		String str2 = "";
		if(gender.equals("1") || gender.equals("2")) {
			str2 = "19"+str1;
		}else if(gender.equals("3") || gender.equals("4")) {
			str2 = "20"+str1;
		}
		
		int year = Integer.parseInt(str2);
		int age= 2025-year;
		return age;
	}
	
	public static boolean method5(String jumin) {
		String[] str = jumin.split("-");
		String yy1 = str[0].substring(0,2);//88
		String mm1 = str[0].substring(2,4);//02
		String dd1 = str[0].substring(4,6);//14
		
		int mm2 = Integer.parseInt(mm1);//문자열-> 숫자열로 변환
		int dd2 = Integer.parseInt(dd1);//문자열-> 숫자열로 변환
		
		boolean bn = true;
		if (mm2 < 1 || mm2>12) {
			bn = false; //재정의
		}else if(dd2 < 1 || dd2 > 31) {
			bn = false;
		}
		
		return bn;
		
	}
	public static String method6(String dates) {
		String[] str =dates.split(",");
		String ss="";
		for(int i = 0; i<str.length; i++) {
			//전체길이 11자 
			if(str[i].length() != 11) {
				ss += str[i]+",";
			}else if(str[i].startsWith("010")== false) {
				ss += str[i]+",";	
			}
		}
		//12346789,01012356, -> 마지막값을 버리는 설정
		if(!ss.equals("")) {
			ss = ss.substring(0,ss.length()-1);
		}
		return ss;
		
	}
	
	
	
	
	
	
}

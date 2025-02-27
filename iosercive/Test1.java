package iosercive;

public class Test1 {
	public static void method1() throws Exception {
		int[] number = {10,0,20};
		
		for(int i = 0; i<number.length; i++) {
			if(number[i]==0) {
				throw new ArithmeticException();
			}else {
				System.out.println(100/number[i]);
			}

		}
	
	}
	
	
	
	
	public static void main(String[] args) {
		try {
			Test1.method1();
		}catch(Exception e) {
			System.out.println("0으로 나누기 처리 오류");
		}
		
		System.out.println("=1004=");
		
	}

}

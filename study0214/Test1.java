package study0214;

public class Test1 {
	int a ; // 멤버변수,인스턴스 변수
	int b ;
	String c;
	int hap() {
		return a+b;
	}
	
	void setA(int z) {
		if (z > 100 || z<0) {
			a=0;
		}else {
			a = z;
		}
		// retrun a; error
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Test1 hong = new Test1();//인스턴스처리 
		//참조클래스 참조변슈 = new(키워드) 생성자
		Test1 kim = new Test1();//인스턴스처리 
		
		hong.setA(50);;
		//hong.a=70; // 참조클래스에서 a라는 변수의 존재유무 확인 후 주요메모리에 있는 변수에 접근
		hong.b=90;
		
		kim.a=30;
		kim.b=40;
		
		System.out.println("홍의 합계:"+hong.hap());
		System.out.println("김의 합계:"+kim.hap());
		
	}

}

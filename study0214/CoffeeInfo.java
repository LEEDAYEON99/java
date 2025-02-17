package study0214;

public class CoffeeInfo {
	String name=""; //멤버변수 , 인스턴스변수(고유메모리에 저장)
	int price = 0; //멤버변수,인스턴스변수(고유메모리에 저장)
	static String maker = ""; //멤버변수,클래스변수(공유메모리 저장)
	
	public void setPrice(int pp) {
		if(pp<100000) {
			price = pp; 
		}
	
	}
	public static void setMaker(String mm) {
		maker = mm;
		
	}
	
}

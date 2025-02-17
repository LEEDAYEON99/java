package study0214;
class Tvlnfo{
	String model;
	String color;
	int size;
	int price;
}
public class TvApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tvlnfo tv1 = new Tvlnfo();
		Tvlnfo tv2 = new Tvlnfo();
		
		tv1.model="mo1TV";
		tv1.color="Red";
		tv1.size=50;
		tv1.price=100;
		
		
		tv2.model="mo2TV";
		tv2.color="Blue";
		tv2.size=55;
		tv2.price=200;
		
		System.out.println("모델명:"+tv1.model+","+"색상:"+tv1.color+","
				+ "크기:"+tv1.size+"인치"+","+"가격:"+tv1.price+"만원");
		System.out.println("모델명:"+tv2.model+","+"색상:"+tv2.color+","
				+ "크기:"+tv2.size+"인치"+","+"가격:"+tv2.price+"만원");
		
	}

}

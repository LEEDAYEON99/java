package study0214;

public class CoffeeMake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeInfo coffee1 = new CoffeeInfo();
		CoffeeInfo coffee2 = new CoffeeInfo();
		
		coffee1.name="아메리카노";
		//coffee1.price=3000;
		coffee1.setPrice(3000);
	
		
		//coffee1.maker="가나";
		CoffeeInfo.maker="가나";
		CoffeeInfo.setMaker("가나");
		
		coffee2.name="바닐라라테";
		coffee2.price=4500;
		//coffee2.maker="브라질";
		CoffeeInfo.maker="브라질";
		
		System.out.println(coffee1.name+","+CoffeeInfo.maker);
		System.out.println(coffee2.name+","+CoffeeInfo.maker);
	}

}

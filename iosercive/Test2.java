package iosercive;
//확장 for문 
public class Test2 {

	public static void main(String[] args) {
		int [] numbers = {11,22,33};
		
		//for(출력변수 : 배열) 출력변수내마음대로 , 출력변수랑 배열의타입은 똑같이
		for(int a : numbers) {
			System.out.println(a);
		}
		System.out.println();
		for(int nn : numbers) {
			System.out.println(nn);
		}
		
		String[] subjects = {"html","java","oracle"};
		for(String a :subjects) {
			System.out.println(a);
		}
		
		
		/*for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}*/
		
		
	}

}

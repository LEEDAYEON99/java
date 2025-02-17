package study0214;

public class Test3 {
	String s1="";//공백
	String s2;//null(null의의미 세팅이 안되어있음)
	String s3=null; //null
	int n1 = 0;//0
	int n2; //0
	boolean bn; //false
	double d;//0.0
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss1 = ""; //공백
		String ss2; //null
		int nn1=0;//0
		int nn2;//null
		System.out.println(ss1);
		//System.out.println(ss2); //null값 단독출력불가
		System.out.println("");
		//System.out.println(null);//null값 단독출력불가
		System.out.println(nn1);
		//System.out.println(nn2);//null값 단독출력불가
		
		
		System.out.println("===============");
		
		Test3 t2 =new Test3();
		System.out.println("s1:"+t2.s1);
		System.out.println("s2:"+t2.s2);
		System.out.println("n1:"+t2.n1);
		System.out.println("n2:"+t2.n2);
		System.out.println("bn:"+t2.bn);
		System.out.println("d:"+t2.d);
		
	}

}

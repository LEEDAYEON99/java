package iosercive;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// Map:: 임시저장소
		Map<String,String> map = new HashMap<String,String>();
		map.put("eng", "100");//(key,value)
		map.put("kor", "90");
		map.put("math", "92");
		
		System.out.println(map.get("eng"));
		System.out.println(map.get("kor"));
		System.out.println(map.get("math"));
	}

}

package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class MapExam {
	public static void main(String[] args) {
		Map<String,Integer> map1 = new HashMap<>();
		Map<String,String> map2 = new Hashtable<>();
		Map<Integer,String> map3 = new TreeMap<>();
		Properties map4= new Properties();
		
		map1.put("Kim" ,90);
		map1.put("Son" ,100);
		map1.put("Tom" ,90);
		
		System.out.println(map1);
	
		if(map1.containsKey("Kim")){
			System.out.println("Kim: "+map1.get("Kim"));
		}
		if(map1.containsValue(100)) {
			System.out.println("100점만점자 존재");
		}
		
		map2.put("김","1코스");
		map2.put("이","2코스");
		map2.put("박","3코스");
		map2.put("김","2코스"); //김이 key에 이미 있음으로 덮어씌운다 
		map2.put("이","3코스");
		map2.put("최","1코스");
		//출력:이=3코스, 최=1코스,김=2코스,박=3코스로 나온다
	 
		//Properties(키,과 값은 모두 문자열로 취급 받는다
		map4.setProperty("name","김기태");
		map4.setProperty("age","43");
		map4.setProperty("height","163");
		map4.setProperty("영어","93");
		System.out.println(map4.getProperty("name"));
	}
}

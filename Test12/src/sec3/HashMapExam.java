package sec3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {
	public static void main(String[] args) {
		Map<String,String> map1= new HashMap<String,String>(); //형변환 가능
		HashMap<String,String> map2 = new HashMap<String,String>(); //형 변환 불가능
		HashMap<String,String> map3 = new HashMap<>(); //자바여서 String String생략 가능
		HashMap<String,String> map4 = new HashMap<>(map2); //맵 복제
		String[] arr = new String[10];
		HashMap<String,String> map5 = new HashMap<>(10); //초기 용량 지전
		HashMap<String,String> map6 = new HashMap<>(10,0.7f); //load factor - 사용확률 지정
		HashMap<String,String> map7 = new HashMap<>() {{
			put("name","Roger");
		}}; //
		HashMap<Integer,String> fruits = new HashMap<>(); 
		fruits.put(1, "사과");
		fruits.put(2, "딸기");
		fruits.put(3, "샤인머스켓");
		fruits.put(4, "망고");
		fruits.put(5, "납작복숭아");
		System.out.println (fruits); 
		for(Integer i:fruits.keySet()) {
			System.out.println(fruits.get(i));
		}
	}
	
}

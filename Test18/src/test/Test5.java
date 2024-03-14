package test;

import java.util.ArrayList;
import java.util.List;

class Fruit{
	private String name;
	private String color;
	public Fruit() {}
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
 
	
 }
public class Test5 {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("포도", "보라"));
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("바나나","노랑")); //list의 Generic 타입은 Fruit로 설정되어야 하지만, Fruit 객체를 추가하여 생성한것이 아닌 String 값을 받는다. 타입 미스매치 오류
		
		for(int i = 0; i<list.size();i++) {   //list는 length로 찾을 수 없으므로 size()로 찾아야한다. Not found attribute
			list.get(i).getName(); //인덱스는 배열객체에서 활용해야 하지만, list(ArrayList) 인 곳에 배열 요소 참조 연산인 []이 사용되었음 => Not Allowed Operation
		}
	
	
	}
}

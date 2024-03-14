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
		list.add(new Fruit("����", "����"));
		list.add(new Fruit("���", "����"));
		list.add(new Fruit("�ٳ���","���")); //list�� Generic Ÿ���� Fruit�� �����Ǿ�� ������, Fruit ��ü�� �߰��Ͽ� �����Ѱ��� �ƴ� String ���� �޴´�. Ÿ�� �̽���ġ ����
		
		for(int i = 0; i<list.size();i++) {   //list�� length�� ã�� �� �����Ƿ� size()�� ã�ƾ��Ѵ�. Not found attribute
			list.get(i).getName(); //�ε����� �迭��ü���� Ȱ���ؾ� ������, list(ArrayList) �� ���� �迭 ��� ���� ������ []�� ���Ǿ��� => Not Allowed Operation
		}
	
	
	}
}

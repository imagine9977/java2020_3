package sec3;

import java.util.ArrayList;
import java.util.List;

class Visitor{
	private String name;
	private int age;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Visitor(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public Visitor() {
		super();
	}
	@Override
	public String toString() {
		return "Visitor [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
}
public class StreamExam4 {
	public static void main(String[] args) {
		List<Visitor> vList = new ArrayList<>();
		vList.add(new Visitor("구라", 900, 900));
		vList.add(new Visitor("김기태", 40, 1000));
		vList.add(new Visitor("김유신", 30, 1500));
		vList.add(new Visitor("김성한", 20, 2000));
		vList.stream().forEach(vis->System.out.println(vis.toString()));
		vList.stream().map(vis->vis.getName()).forEach(s->System.out.println(s));
		System.out.println("30세 이상 목록: ");
		vList.stream().filter(vis->vis.getAge()>=30)
		.map(c->c.getName()).sorted()
		.forEach(s->System.out.println(s));
		
	}
}
